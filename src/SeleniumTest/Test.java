package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        //System.out.println("Selenium testing");
       System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");


        WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
       String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
}
