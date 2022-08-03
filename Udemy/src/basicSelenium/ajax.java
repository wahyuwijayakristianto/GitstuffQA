package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ajax {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("span[class='nav-line-2 ']"))).build().perform();
    }
}
