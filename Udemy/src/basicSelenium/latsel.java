package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class latsel {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.231.126.7:7007/");
        driver.findElement(By.cssSelector("#nik")).sendKeys("14110718");
        driver.findElement(By.cssSelector("#pin")).sendKeys("134679");
        driver.findElement(By.cssSelector("#btnLogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div:nth-child(1) > aside:nth-child(4) > section:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[href='/report_masterItemJenisLokasi']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#jenisToko")).sendKeys(Keys.F9);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='search']")).sendKeys("ALFA X");
        driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(5) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#btnProses")).click();

        driver.switchTo().alert().accept();
    }
}
