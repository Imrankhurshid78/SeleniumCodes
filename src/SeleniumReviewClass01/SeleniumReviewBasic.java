package SeleniumReviewClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReviewBasic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.get("http://www.gmail.com");
        driver.navigate().to("https://demoqa.com/text-box");
        WebElement username = driver.findElement(By.id("userNmae"));
        username.sendKeys("abacacs");
        username.clear();
        username.sendKeys("xyxyxy");


    }
}
