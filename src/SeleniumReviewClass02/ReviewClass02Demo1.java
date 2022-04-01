package SeleniumReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReviewClass02Demo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement female = driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));

        //check if radion button is enabled
        System.out.println("the female radio button is enabled " + female.isEnabled());

        //check if radio button female is displayed
        System.out.println("the female radio button is displayed " + female.isDisplayed());

        //check if its selected or not
        System.out.println("The female radio button is selected " + female.isSelected());

        //check if female button is not selected please select
        if (female.isSelected()) {
            female.click();
        }
        //check the status of selection again
        System.out.println("the female radio button is selected " + female.isSelected());

        //Get all the links in current webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));


        for(WebElement link:links){
            String name = link.getText();
            if(!name.isEmpty()){
                System.out.println(name);
            }

        }
    }
}
