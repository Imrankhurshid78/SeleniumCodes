package SeleniumReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownReview02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
       WebElement newAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));

       newAccount.click();
        Thread.sleep(1000);
       // to get the desired dropdown
       WebElement daysOption= driver.findElement(By.cssSelector("select#day"));
       //use seleinum select class
        Select days=new Select(daysOption);
        days.selectByValue("5");
        Thread.sleep(2000);
        days.selectByIndex(0);
        Thread.sleep(2000);
        days.selectByVisibleText("25");

    //Print all Drop Down options
        //get all the option using Select class
       List<WebElement> options= days.getOptions();
       for(WebElement option:options){
           System.out.println(option.getText());
       }

    }
}
