package latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class lat5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
        driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(5) > button:nth-child(1)")).click();
        for (int i = 0; i < 2; i++) {
            driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(4) > a:nth-child(3)")).click();
        }
        driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(5) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshetatyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();
        Thread.sleep(6000);
        String promoCode = driver.findElement(By.cssSelector(".promoInfo")).getText();
        if(promoCode.equals("Code applied ..!") ){
            System.out.println(promoCode);
            driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > button:nth-child(14)")).click();
        }
        else{
            System.err.println(promoCode);

        }

    }
}
