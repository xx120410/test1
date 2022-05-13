package com.xx.demo.test1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author:CZX
 * @create:2019-04-02 15:26
 * @desc:
 **/
public class PropertyUtils {

    public static Properties confProperties;

    static {
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void init() throws IOException {
        if (confProperties == null) {
            confProperties = new Properties();
            InputStream in = PropertyUtils.class.getClassLoader().getResourceAsStream("conf.properties");

            try {
                confProperties.load(in);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                in.close();
            }
        }
    }

    public static Properties getProperties() throws IOException {
        init();
        return confProperties;
    }

    public static void clear() {
        confProperties.clear();
        confProperties = null;
    }

    public static String get(String key) {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return confProperties.getProperty(key);
    }
}
