package SeleniumClass10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        //driver is here to use down-casting to take current browser screenshot not all displays
        TakesScreenshot ts=(TakesScreenshot) driver;

        File srcFile= ts.getScreenshotAs(OutputType.FILE);//The screenshot is taken this step
        

        try {
            //Calling Util from common.Io from library then make path to store png/jpeg file
            FileUtils.copyFile(srcFile, new File("screenshots/SmartBear/adminLogin111.png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}