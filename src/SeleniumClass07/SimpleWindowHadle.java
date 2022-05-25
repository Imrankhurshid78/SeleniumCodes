package SeleniumClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHadle {

    /*click on help link
    switch between tabs

     */

    public static String url = "http://accounts.google.com/signup";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        String mainpageHandle = driver.getWindowHandle();//get window for main page
        System.out.println(mainpageHandle);

        WebElement helpLink =driver.findElement(By.linkText("Help"));
        helpLink.click();
        Set<String> allWindowHandles = driver.getWindowHandles();//store all handles in a set
        System.out.println(allWindowHandles.size());

        Iterator<String > it=allWindowHandles.iterator();//have an iterator in order to iterate through the handle
        mainpageHandle =it.next();//take the first step and assign the main handle
       String childHandle=it.next();//take the second and have a child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        //driver.switchTo().window(mainpageHandle);
        driver.switchTo().window(childHandle);

        driver.close();
        driver.switchTo().window(mainpageHandle);
        helpLink.click();
        driver.quit();

}
}