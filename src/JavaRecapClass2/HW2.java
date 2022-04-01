package JavaRecapClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("xyzsd");
        driver.findElement(By.name("reg_email__")).sendKeys("john@aol.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("john@aol.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("tester@123");
        driver.findElement(By.name("birthday_month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_day")).sendKeys("14");
        driver.findElement(By.name("birthday_year")).sendKeys("1978");
       driver.findElement(By.xpath("//label[text()='Male']")).click();
        // driver.findElement(By.name("sex")).sendKeys("Male");
        //driver.findElement(By.name("sex")).
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
