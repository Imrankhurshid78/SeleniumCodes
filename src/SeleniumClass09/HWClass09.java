package SeleniumClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HWClass09 {
    /* HW
    Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    click on leave
    click on leave list
    choose from "From calendar"
    choose from "To calendar"
    click only on cancelled and rejected checkboxes
    uncheck Pending Approval
    select IT support from DD
    click search
    quit the browser */
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //manage timeout & wait buy seconds
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leavebutton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leavebutton.click();
        WebElement fromCalender = driver.findElement(By.id("calFromDate"));
        fromCalender.click();

        WebElement monthDD = driver.findElement(By.className("ui-datepicker-month"));
        Select select = new Select(monthDD);
        select.selectByVisibleText("Apr");

        List<WebElement> fromDates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
        //table[@class ='ui-datepicker-calendar']/tbody/tr/td
        for (WebElement fromdate : fromDates) {
            String dateText = fromdate.getText();
            if (dateText.equals("14")) {
                fromdate.click();
                break;
            }
        }

        WebElement toCalender=driver.findElement(By.id("calToDate"));
        toCalender.click();
        WebElement tomonthDD=driver.findElement(By.className("ui-datepicker-month"));
        Select select1=new Select(tomonthDD);
        select1.selectByVisibleText("May");

        List<WebElement> toDates=driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement todate:toDates){
            String todateText=todate.getText();
            if (todateText.equals("14")){
                todate.click();
                break;
            }
        }
            WebElement rejectBox=driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_-1\"]"));
            rejectBox.click();

            WebElement cancelBox=driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_0\"]"));
            cancelBox.click();

            WebElement pendingBox =driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_1\"]"));
            pendingBox.click();

            WebElement subUnitDBox=driver.findElement(By.id("leaveList_cmbSubunit"));
            Select select2=new Select(subUnitDBox);
            select2.selectByVisibleText("IT Support");

            WebElement searchButton=driver.findElement(By.id("btnSearch"));
            searchButton.click();

            driver.quit();


            }
        }


