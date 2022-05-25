package SeleniumClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to http://www.uitestpractice.com/Students/Contact
click on the link
get text
print out in the console
 */
public class HW2 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    String mainPageHandle=driver.getWindowHandle();
        WebElement link= driver.findElement(By.linkText("This is a Ajax link"));
        link.click();
        WebElement text=driver.findElement(By.tagName("p"));
        System.out.println(text.getText());
        driver.close();
}

}