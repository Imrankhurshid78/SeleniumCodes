package JavaRecapClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstname = driver.findElement(By.id("customer.firstName"));
        firstname.sendKeys("Abcdf");
        WebElement lastname = driver.findElement(By.id("customer.lastName"));
        lastname.sendKeys("Axyz");
        WebElement address = driver.findElement(By.name("customer.address.street"));
        address.sendKeys("House No. 11111, xyz ct.");
        WebElement city =driver.findElement(By.name("customer.address.city"));
        city.sendKeys("Woodbridge");
        WebElement state = driver.findElement(By.id("customer.address.state"));
        state.sendKeys("VA");
        WebElement zip = driver.findElement(By.name("customer.address.zipCode"));
        zip.sendKeys("22192");
        WebElement phone = driver.findElement(By.name("customer.phoneNumber"));
        phone.sendKeys("571111111");
        WebElement ssn = driver.findElement(By.name("customer.ssn"));
        ssn.sendKeys("000-12-0000");
        WebElement username=driver.findElement(By.name("customer.username"));
        username.sendKeys("username123");
        WebElement password = driver.findElement(By.name("customer.password"));
        password.sendKeys("vhbkjkj");
        WebElement confirm = driver.findElement(By.name("repeatedPassword"));
        confirm.sendKeys("vhbkjkj");
        WebElement regBotton = driver.findElement(By.className("button"));
        regBotton.click();
        driver.quit();



    }
}
