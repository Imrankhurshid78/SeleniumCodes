package SeleniumClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
 */
public class HW1Class08 {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement remove = driver.findElement(By.xpath("//input[@type='checkbox']"));//enable check box
        remove.click();
        driver.findElement(By.xpath("//button[@type='button'and@onclick='swapCheckbox()']")).click();//Remove button
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        WebElement message = driver.findElement(By.xpath("//*[@id='message']"));
        System.out.println(message.getText());
        if (message.getText().equals("It's gone!")) {
            System.out.println("Remove button  is enabled");
        } else {
            System.out.println("it is not enabled");
        }
        driver.findElement(By.xpath("//button[@autocomplete='off'and@type='button'and@onclick='swapInput()']")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement disable = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(disable.getText());
        if (disable.getText().equals("It's enabled!")) {
            System.out.println(" button  is enabled");
        } else
            System.out.println("it is not enabled!!try again");
        WebElement text = driver.findElement(By.xpath("//input[@style='width: 30%;']"));
        text.sendKeys("hi");
        WebElement a = driver.findElement(By.xpath("//button[text()='Disable']"));
        a.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement b = driver.findElement(By.xpath("//p[@id='message']"));

        System.out.println(b.getText());
        if (b.getText().equals("It's disabled!")) {
            System.out.println("Disable button  is enabled");
        } else {
            System.out.println("try carefully");
        }
    }
}