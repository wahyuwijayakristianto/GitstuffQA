package latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class lat2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String name = "Aan";
        String password = getPassword(driver);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        sleep();
        Thread.sleep(5000);
        driver.close();


    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        sleep();
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(1000);
        String passText = driver.findElement(By.cssSelector(".infoMsg")).getText();
        String[] passArray = passText.split("'");
        String[] PassArray2 = passArray[1].split("'");
        String password = PassArray2[0];
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        return password;
    }

    public static void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }
}
