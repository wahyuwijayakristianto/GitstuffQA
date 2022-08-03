package latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lat12 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickacademy.com/practice.php");
        driver.findElement(By.xpath("(//input[@id='autocomplete'])[1]")).sendKeys("Ind");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='autocomplete'])[1]")).sendKeys(Keys.ARROW_DOWN);

        driver.findElement(By.xpath("(//input[@id='autocomplete'])[1]")).sendKeys(Keys.ARROW_DOWN);

        System.out.println(driver.findElement(By.xpath("(//input[@id='autocomplete'])[1]")).getAttribute("value"));
    }
}
