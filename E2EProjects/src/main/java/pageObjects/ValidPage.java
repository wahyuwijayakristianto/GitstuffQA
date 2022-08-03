package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidPage {
    public WebDriver driver;
    By button = By.name("ctl00$ContentPlaceHolder1$img1");

    By judul = By.cssSelector(".judulsub");

    public ValidPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getButton(){
        return driver.findElement(button);
    }
    public WebElement getJudul(){
        return driver.findElement(judul);
    }
}
