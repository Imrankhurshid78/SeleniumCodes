package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/* Amazon link count:
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text*/
public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        for (WebElement count : Links) {
            String linktext = count.getText();
            //String allLinks =count.getAttribute()
            System.out.println(linktext + "  " + count.getAttribute("href"));
            if (!linktext.isEmpty()) {
                System.out.println(linktext + " " + count);
            }
            //driver.quit();

        }
    }
}
