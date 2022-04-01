package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        //Thread.sleep(2000);


        driver.navigate().refresh();

        //String url = driver.getCurrentUrl();
        //System.out.println(url);
       // String title = driver.getTitle();
       // System.out.println(title);
        //driver.close();//will close active tab only
        driver.quit();//will close whole browser
    }
}
