package latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lat10 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickacademy.com/practice.php");
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        WebElement op2 = driver.findElement(By.cssSelector("label[for='bmw']"));
        String op2text = op2.getText();
        driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select s = new Select(dropdown);
        s.selectByVisibleText(op2text);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(op2text);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        String alert = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        String alert2 = alert.split(",")[0];
        String alert3 = alert2.split(" ")[1];
        if(op2text.equals(alert3)){
            System.out.println(op2text+" sama di pop up");
        }
        else{
            System.out.println(op2text+" tidak sama di pop up");
        }
    }
}
