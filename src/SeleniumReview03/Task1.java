package SeleniumReview03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement topic=driver.findElement(By.xpath("//*[@id=\"topic\"]"));
        System.out.println(topic.getText());

        driver.switchTo().defaultContent();//no again focus on main page 1st to go to next step.
        driver.switchTo().frame(1);

        WebElement dropDown=driver.findElement(By.tagName("select"));
        Select select=new Select(dropDown);
        select.selectByIndex(2);


        driver.switchTo().defaultContent();

        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();


       //topic.click();

        //driver.switchTo().frame("frame1");
        //driver.switchTo().frame("frame3");
        //WebElement checkbox= driver.findElement(By.cssSelector("input#a"));
        //checkbox.click();

    }
}