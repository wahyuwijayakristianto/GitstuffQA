package basicSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //d javacript cosole window.scrollBy(x,y)
        js.executeScript("window.scrollBy(0,500)");
        //basicSelenium.scroll tabel/window tertentu js.executeScript("document.querySelector('').scrollTop=5000")
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=100");
    }
}
