package Academy;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;
    Properties prop;
    public WebDriver initializeDriver() throws IOException {
         prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");
        prop.load(fis);
       // String browser = prop.getProperty("browser");

        // mvn test -Dbrowser=chrome
        String browser = System.getProperty("browser");
        if (browser.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D://Work QA Engineer//chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            if (browser.contains("headless")){
            options.addArguments("headless");}
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public String getScreenShootPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
        FileUtils.copyFile(source,new File(destinationFile));
        return destinationFile;
    }
}
