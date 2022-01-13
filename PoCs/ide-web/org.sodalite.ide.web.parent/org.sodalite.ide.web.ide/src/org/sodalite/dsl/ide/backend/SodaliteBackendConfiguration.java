package org.sodalite.dsl.ide.backend;


public class SodaliteBackendConfiguration {
	final static String KB_REASONER_URI = "http://192.168.2.97:8080/reasoner-api/v0.6/"; // TestBed;
//	final public static String KB_REASONER_URI = "http://160.40.52.200:8084/reasoner-api/v0.6/"; //CERTH

	final public static String IaC_URI = "http://192.168.2.107:8081/";

	final public static String Image_Builder_URI = "http://192.168.2.70:5000/";

	final public static String xOPERA_URI = "http://192.168.2.18:5000/";

	final public static String PDS_URI = "http://192.168.2.178:8089/";

	final public static String Refactorer_URI = "http://192.168.2.166:8080/";

	final public static String Consul_IP = "192.168.3.74";

	final public static String Grafana_Registry_URI = "http://192.168.3.74:3001/";

	final public static String Grafana_URI = "http://192.168.3.74:3000/";

	final public static String RulesServer_URI = "http://192.168.3.74:9092/";

	final public static String SKYDIVE_ANALYZER_URI = "192.168.2.11:8088";

	final public static String VAULT_SECRET_UPLOADER_URI = "http://192.168.3.74:8202";

	final public static String KEYCLOAK_URI = "http://192.168.2.53:8080/";
	
	final public static String KEYCLOAK_USER = "yosu";
	
	final public static String KEYCLOAK_PASSWORD = "";

	final public static String KEYCLOAK_CLIENT_ID = "sodalite-ide";

	final public static String KEYCLOAK_CLIENT_SECRET = "1a1083bc-c183-416a-9192-26076f605cc3";

	final public static Boolean KEYCLOAK_ENABLED = false;

}
