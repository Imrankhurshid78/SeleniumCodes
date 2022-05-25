package SeleniumReview03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //find Alert and click on it
        WebElement simpleAlert=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button"));
        simpleAlert.click();

        //Handling the Alert
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        WebElement javaAlert=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
        javaAlert.click();
        Thread.sleep(2000);
        driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("Hello World");
        alert.accept();
    }
}