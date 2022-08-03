package latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Lat8 {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(2000);
        addItems(driver, itemsNeeded);
    }
    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName=name[0].trim();
            System.out.println(formattedName);
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length) {
                    break;
                }
            }
            driver.findElement(By.cssSelector("img[alt='Cart']")).click();
            driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
            driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
            driver.findElement(By.cssSelector(".promoBtn")).click();
            driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > button:nth-child(14)")).click();
            driver.findElement(By.cssSelector("div[class='wrapperTwo']")).click();
            driver.findElement(By.cssSelector("option[value='Albania']")).click();
            driver.findElement(By.cssSelector("input[type='checkbox']")).click();
            driver.findElement(By.cssSelector("div[class='wrapperTwo'] button")).click();
        }
    }
}