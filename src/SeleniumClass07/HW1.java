package SeleniumClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

/*
HW
Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify (compare) the titles for each page
Print out the title of the all pages
 */
public class HW1 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle=driver.getWindowHandle();
        WebElement newTab=driver.findElement(By.id("tabButton"));
        newTab.click();
        //System.out.println(newTab.getText());
      //String text=driver.findElement(By.id("sampleHeading"));

        System.out.println(newTab.getText());

        WebElement newWindow=driver.findElement(By.id("windowButton"));
        newWindow.click();
        System.out.println(newWindow.getText());

        Set<String> allWindowHandles=driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it=allWindowHandles.iterator();
        while (it.hasNext()){
            String handle= it.next();
            String title=driver.getTitle();
            System.out.println(title);
        }
        driver.quit();

    }
}