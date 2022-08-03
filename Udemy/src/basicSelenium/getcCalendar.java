package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class getcCalendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.xpath("//input[@id='travel_date']")).click();

        while (!driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText().contains("December"))
        {
            driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
        }

        List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
        int count = driver.findElements(By.cssSelector(".day")).size();
        for (int i = 0; i < count; i++) {
            String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
            if (text.equalsIgnoreCase("23")) {
                driver.findElements(By.cssSelector(".day")).get(i).click();
                break;
            }
            System.out.println(text);
        }
    }
}
