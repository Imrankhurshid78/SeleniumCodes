package SeleniumClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWClass10 {
    //Go to aa.com/homePage.do
//select depart date
//select return date
//select destination
//click on search
//quit the browser



        public static String url = "http://www.aa.com/homePage.do";

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            driver.manage().window().maximize();
           // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            WebElement departureMonth = driver.findElement(By.className("ui-datepicker-trigger"));
            departureMonth.click();

            WebElement nextButton = driver.findElement(By.xpath("//a@aria-label='Next Month']"));

            WebElement depMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'])[1]"));

            String depMonthText = depMonth.getText();

            while (!depMonthText.equals("August")) {

                nextButton.click();
                nextButton = driver.findElement(By.xpath("//a@aria-label='Next Month']"));
                depMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'])[1]"));
                depMonthText = depMonth.getText();

            }

            List<WebElement> departureDates = driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']//tr/td"));

            for (WebElement departureDate: departureDates) {

                if (departureDate.getText().equals("20")) {
                    departureDate.click();
                    break;
                }
            }

            //select return date

            driver.findElement(By.xpath("//button@class = 'ui-datepicker-trigger'])[2]")).click();

            WebElement returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'])[1])"));
            String returnMonthText = returnMonth.getText();

            while (!returnMonthText.equals("October")) {

                nextButton.click();
                nextButton = driver.findElement(By.xpath("//a@aria-label='Next Month']"));

                returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'])[1])"));
                returnMonthText = returnMonth.getText();

            }

            List <WebElement> arrivalDates = driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']//tr/td"));

            for (WebElement arrivalDate : arrivalDates) {

                if (arrivalDate.getText().equals("20")) {
                    arrivalDate.click();
                    break;
                }
            }

            //select destination
            WebElement arrivalBox = driver.findElement(By.id("(reservationFlightSearchForm.destinationAirport"));
            arrivalBox.sendKeys("IKA", Keys.ENTER);

            //click on search
            WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
            searchButton.click();

            //Quit the browser
            driver.quit();

        }
    }
