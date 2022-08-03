package latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class lat4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("#checkBoxOption1")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#checkBoxOption1")).click();
        System.out.println(
                driver.findElements(By.cssSelector("input[type='checkbox']")).size()
        );
    }
}