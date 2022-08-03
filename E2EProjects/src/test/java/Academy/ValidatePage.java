package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ValidPage;

import java.io.IOException;

public class ValidatePage extends Base {
    public WebDriver driver;
    public static Logger log = LogManager.getLogger(Base.class.getName());
    @BeforeTest
    public void beforeTest() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        log.info("validate start");
    }

    @Test
    public void valid() throws IOException {
        ValidPage v = new ValidPage(driver);
        driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_TextBox1")).click();
        v.getButton().click();
        Assert.assertTrue(v.getJudul().isDisplayed());
        log.info("validate success");
    }

    @AfterTest
    public void afterTest(){
        driver.close();
        log.info("validate close");
    }
}
