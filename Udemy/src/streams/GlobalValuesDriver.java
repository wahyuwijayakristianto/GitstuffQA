package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDriver {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Wahyu\\IdeaProjects\\Udemy\\src\\streams\\dataprop");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser","firefox");

        System.out.println(prop.getProperty("browser"));
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Wahyu\\IdeaProjects\\Udemy\\src\\streams\\dataprop");
        prop.store(fos,null);
    }
}
