package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class HomePage extends Base {
    public WebDriver driver;
    public static Logger log = LogManager.getLogger(Base.class.getName());
    @BeforeTest
    public void beforeTest() throws IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        log.info("login start");
    }

    @Test(dataProvider = "getData")
    public void basePageNavigation(String username, String password) throws IOException {
        driver.get(prop.getProperty("url"));
        LandingPage l = new LandingPage(driver);
        l.getUsername().sendKeys(username);
        l.getPassword().sendKeys(password);
        l.getLogin().click();
        l.getLogout().click();
        log.info("login success");
    }

    @AfterTest
    public void afterTest() {
        driver.close();
        log.info("login closes");
    }

    @DataProvider
    public Object[][] getData() {
        String[][] data = new String[2][2];
        data[0][0] = "682018022";
        data[0][1] = "01012000";

        data[1][0] = "682018022";
        data[1][1] = "010120000";
        return data;
    }


}
