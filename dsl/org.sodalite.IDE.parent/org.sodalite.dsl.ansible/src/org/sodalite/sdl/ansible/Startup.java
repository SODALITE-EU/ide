package org.sodalite.sdl.ansible;

import java.util.HashMap;
import java.util.Map;

import org.bson.Document;
import org.eclipse.ui.IStartup;
import org.sodalite.dsl.ansible.helper.AnsibleHelper;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		Map<String,Document> collectionData = new HashMap<String,Document>();
		MongoCollection<Document> mongo_collection = AnsibleHelper.getAnsibleCollections();
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
