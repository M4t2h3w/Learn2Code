package sk.midnightnoon.simpleormframework.dbaccess;

import java.io.InputStream;

public class PropertiesReader {
    public static final String DB_URL = "db.url";
    public static final String DB_DRIVER = "db.driver";
    public static final String DB_USER = "db.user";
    public static final String DB_PSW = "db.psw";

    public String getProperty(String property) throws Exception{
        String fileName = "sorm.properties";

        java.util.Properties prop = new java.util.Properties();
        InputStream input = null;
        input = getClass().getClassLoader().getResourceAsStream(fileName);
        if(input == null){
            throw new Exception("Could not find the file sorm.properties");
        }

        prop.load(input);

        String propertyValue = prop.getProperty(property);
        if(propertyValue != null && !propertyValue.isEmpty()){
            return propertyValue;
        } else {
            throw new Exception("Property '" + property + "' not specified in sorm.properties file");
        }
    }
}
