package org.sodalite.dsl.ide.backend;


public class SodaliteBackendConfiguration {
//	final static String KB_REASONER_URI = "http://192.168.2.130:8080/reasoner-api/v0.6/"; // Private TestBed
	final static String KB_REASONER_URI = "https://semantic-web.public-testbed.sodalite.eu/reasoner-api/v0.6/"; // Public TestBed
//	final public static String KB_REASONER_URI = "http://160.40.52.200:8084/reasoner-api/v0.6/"; //CERTH

//	final public static String IaC_URI = "http://192.168.2.107:8081/"; // Private TestBed
	final public static String IaC_URI = "https://iac-builder.public-testbed.sodalite.eu/"; // Public TestBed

	final public static String Image_Builder_URI = "http://192.168.2.70:5000/";

//	final public static String xOPERA_URI = "http://192.168.2.18:5000/"; // Private TestBed
	final public static String xOPERA_URI = "https://xopera-rest-api.public-testbed.sodalite.eu/"; // Public TestBed

	final public static String PDS_URI = "http://192.168.2.178:8089/";

//	final public static String Refactorer_URI = "http://192.168.2.166:8080/"; // Private TestBed
	final public static String Refactorer_URI = "https://rule-based-refactorer.public-testbed.sodalite.eu/"; // Public TestBed

//	final public static String Consul_IP = "192.168.3.74"; // Private TestBed
	final public static String Consul_IP = "https://consul.public-testbed.sodalite.eu"; // Public TestBed

//	final public static String Grafana_Registry_URI = "http://192.168.3.74:3001/"; // Private TestBed
	final public static String Grafana_Registry_URI = "https://grafana-registry.public-testbed.sodalite.eu"; // Public TestBed

//	final public static String Grafana_URI = "http://192.168.3.74:3000/"; // Private TestBed
	final public static String Grafana_URI = "https://grafana.public-testbed.sodalite.eu"; // Public TestBed

	final public static String RulesServer_URI = "http://192.168.3.74:9092/";

//	final public static String SKYDIVE_ANALYZER_URI = "192.168.2.11:8088"; // Private TestBed
	final public static String SKYDIVE_ANALYZER_URI = "https://skydive-analyzer.public-testbed.sodalite.eu"; // Public TestBed

	final public static String VAULT_SECRET_UPLOADER_URI = "http://192.168.3.74:8202";

//	final public static String KEYCLOAK_URI = "http://192.168.2.53:8080/"; // Private TestBed
	final public static String KEYCLOAK_URI = "https://keycloak.public-testbed.sodalite.eu/"; // Public TestBed
	
	final public static String KEYCLOAK_USER = "yosu";
	
	final public static String KEYCLOAK_PASSWORD = "qwerty123";

	final public static String KEYCLOAK_CLIENT_ID = "sodalite-ide";

//	final public static String KEYCLOAK_CLIENT_SECRET = "1a1083bc-c183-416a-9192-26076f605cc3"; // Private TestBed
	final public static String KEYCLOAK_CLIENT_SECRET = "6a2d840b-9e72-47af-97b4-13226855111a"; // Public TestBed

	final public static Boolean KEYCLOAK_ENABLED = true;

}
