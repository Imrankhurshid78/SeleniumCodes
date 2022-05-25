package SeleniumClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
navigate http://syntaxprojects.com/dynamic-elements-loading.php
 *  click on start button
 *  get the text
 *  print out in console
 */
public class Task1 {
    public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement clickStartButton=driver.findElement(By.id("startButton"));
        clickStartButton.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Welcome')]")));
        WebElement welcome = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
        System.out.println(welcome.getText());


    }
}