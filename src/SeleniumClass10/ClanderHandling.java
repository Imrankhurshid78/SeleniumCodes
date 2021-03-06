package SeleniumClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClanderHandling {
    public static String url = "http://delta.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement calender=driver.findElement(By.id("input_departureDate_1"));
        calender.click();
        WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
        WebElement dMonth=driver.findElement(By.className("dl-datepicker-month-0"));
        String dMonthText=dMonth.getText();

        while (!dMonthText.equals("August")){
            nextButton.click();
            dMonthText=dMonth.getText();
        }
        List<WebElement> departDates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement departdate:departDates){
            if(departdate.getText().equals("13")){
                departdate.click();
                break;
            }
        }

        WebElement rMonth=driver.findElement(By.className("dl-datepicker-month-1"));
        String rMonthText=rMonth.getText();
        while (!rMonthText.equals("November")){
            nextButton.click();
            rMonthText=rMonth.getText();
        }
        List<WebElement> returnDates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
        for (WebElement returnDate:returnDates){
            if(returnDate.getText().equals("13")){
                returnDate.click();
                break;
            }
        }
        WebElement doneButton=driver.findElement(By.className("donebutton"));
        doneButton.click();

    }
}