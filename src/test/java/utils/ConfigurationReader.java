package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static final Logger log = LoggerFactory.getLogger(ConfigurationReader.class);
    private static Properties properties = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.yaml");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            log.info("File not found with given path!" + e.getMessage());
        }

    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}
