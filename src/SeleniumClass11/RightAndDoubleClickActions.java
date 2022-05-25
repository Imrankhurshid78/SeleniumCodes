package SeleniumClass11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions {
    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action=new Actions(driver);
        action.contextClick(rightClickButton).perform();

        WebElement editOption=driver.findElement(By.xpath("//span[text() = 'Edit']"));
       // editOption.click();
        action.click(editOption).perform();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement doubleClick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
        Actions actions=new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();
       // Alert alert1=driver.switchTo().alert();
        //alert1.accept();
        driver.quit();




    }
}
