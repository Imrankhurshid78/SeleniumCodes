package SeleniumClass06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
    //username:password@

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
            WebDriver driver=new ChromeDriver();
        driver.get(url);
    }
}
