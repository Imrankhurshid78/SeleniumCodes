package SeleniumReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxReview02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //Check the check Box
        WebElement checkBox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("The CheckBox is Selected"+checkBox1.isSelected());
        checkBox1.click();
        Thread.sleep(2000);
        WebElement textElement=driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Dispalyed "+textElement.getText());
        //to de selected
        checkBox1.click();


        //get all the available options
       List<WebElement> checkBoxes= driver.findElements(By.className("cb1-element"));
       for(WebElement checkBox:checkBoxes){
           checkBox.click();

       }
       Thread.sleep(2000);
       for(WebElement checkbox:checkBoxes){
           checkbox.click();
       }

    }
}
