package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class switchframe {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        // driver.switchTo().frame(1);
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("draggable"));
        a.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();
    }
}
