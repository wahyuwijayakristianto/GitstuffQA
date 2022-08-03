package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    public WebDriver driver;

    By username = By.cssSelector("#ctl00_ContentPlaceHolder1_TextBox1");
    By password = By.cssSelector("#ctl00_ContentPlaceHolder1_TextBox2");
    By login = By.cssSelector("#ctl00_ContentPlaceHolder1_Button2");

    By logout = By.cssSelector("#ctl00_Button1");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(username);
    }
    public WebElement getPassword() {
        return driver.findElement(password);
    }
    public WebElement getLogin() {
        return driver.findElement(login);
    }
    public WebElement getLogout() {
        return driver.findElement(logout);
    }
}


