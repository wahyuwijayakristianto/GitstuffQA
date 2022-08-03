import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adds {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://QA//chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/");
        WebElement nt = driver.findElement(By.cssSelector("body > div:nth-child(36) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)"));

        if(nt.isDisplayed()){
            nt.click();
            System.out.println("berhasil 1");
        }
        System.out.println("berhasil 2");
    }
}
