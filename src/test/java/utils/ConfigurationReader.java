package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // Logger instance to log information and errors
    public static final Logger log = LoggerFactory.getLogger(ConfigurationReader.class);
    private static Properties properties = new Properties();

    static {

        try {
            // Load properties from the configuration.yaml file
            FileInputStream file = new FileInputStream("configuration.yaml");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            // Log an error message if the file is not found or cannot be loaded
            log.info("File not found with given path!" + e.getMessage());
        }

    }
    /**
     * Retrieves the value associated with the given keyword from the properties.
     *
     * @param keyword the key to look up in the properties
     * @return the value associated with the key, or null if the key is not found
     */
    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}
