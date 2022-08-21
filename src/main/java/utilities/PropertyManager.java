package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String url;
    private static String username;
    private static String password;

    public static PropertyManager getInstance(){
        Properties properties = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
            properties.load(fi);
        }catch (Exception e){
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");

        return instance;
    }

    public String getUrl(){
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
