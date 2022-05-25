package SeleniumClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IMplicitWaitDemo {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



        public static String url = "http://syntaxprojects.com/index.php";



        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
            WebElement startPracticingButton = driver.findElement(By.id("btn_basic_example"));
            startPracticingButton.click();
        }
    }


