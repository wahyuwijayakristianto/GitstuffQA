package latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lat6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.4.1.121:1065/");
        driver.findElement(By.cssSelector("#nik")).sendKeys("20085780");
        driver.findElement(By.cssSelector("#btncari")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("tbody tr:nth-child(20) td:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#pin")).sendKeys("12345");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

    }
}
