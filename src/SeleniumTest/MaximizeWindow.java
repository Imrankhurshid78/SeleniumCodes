package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

    }
}
