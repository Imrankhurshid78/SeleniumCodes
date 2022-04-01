package JavaRecapClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://fb.com");
        driver.findElement(By.id("email")).sendKeys("syntax@abcd.com");
        driver.findElement(By.id("pass")).sendKeys("Whatever");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Forgot password?")).click();//when you know full text
        driver.findElement(By.partialLinkText("Forgot")).click();//when you search partly.
        driver.quit();
    }
}
