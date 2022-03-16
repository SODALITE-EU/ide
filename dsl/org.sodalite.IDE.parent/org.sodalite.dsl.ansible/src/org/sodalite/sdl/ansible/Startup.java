package org.sodalite.sdl.ansible;

import java.util.HashMap;
import java.util.Map;

import org.bson.Document;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IStartup;
import org.sodalite.dsl.ansible.exceptions.MongoDBNotFound;
import org.sodalite.dsl.ansible.helper.AnsibleHelper;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.ide.ui.backend.SodaliteBackendProxy;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;



public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		
		SodaliteBackendProxy.createMongoClient();
		
		
		
		Map<String,Document> collectionData = new HashMap<String,Document>();
		MongoCollection<Document> mongo_collection ;
		try{
			mongo_collection = AnsibleHelper.getAnsibleCollections();	
		}
		catch(MongoDBNotFound e){
			return;
		}
		FindIterable<Document> fi = mongo_collection.find();
		MongoCursor<Document> cursor = fi.iterator();
		try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                collectionData.put(document.getString("_id"), document);
            }
        } finally {
            cursor.close();

        }
		AnsibleHelper.setCollectionData(collectionData);
		
		
		
		
	}
}
