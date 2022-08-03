package latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lat11 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickacademy.com/practice.php");
        List<WebElement> col = driver.findElements(By.xpath("//fieldset/table/tbody/tr"));
        List<WebElement> row = driver.findElements(By.xpath("//fieldset/table/tbody/tr[3]/td"));
        System.out.println("jumlah col " + col.size());
        System.out.println("jumlah row " + row.size());
        System.out.println(row.get(0).getText()+" / "+row.get(1).getText()+" / "+row.get(2).getText());

    }
}
