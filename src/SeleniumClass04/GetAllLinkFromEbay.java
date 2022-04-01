package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinkFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number os Links"+allLinks.size());
        for(WebElement link:allLinks){
            String linkText =link.getText();
            String fullLink=link.getAttribute("href");

            if(linkText.isEmpty()){
                System.out.println(linkText+"   "+fullLink);
            }

        }

    }
}
