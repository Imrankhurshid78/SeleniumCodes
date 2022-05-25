package SeleniumClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingPagination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //manage timeout & wait buy seconds
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.id("btnLogin"));
        loginButton.click();
        //Navigating employee page
        WebElement pimButton=driver.findElement(By.id("menu_pim_viewPimModule"));
        pimButton.click();
        WebElement addEmployeeButton=driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeButton.click();

        //Adding an employee & saving
        WebElement firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys("Zubair");
        WebElement lastName=driver.findElement(By.id("lastName"));
        lastName.sendKeys("Ali");
        WebElement empIdField = driver.findElement(By.id("employeeId"));
       //We will get the attribute that will return the value of that field
        //returning String value(Value is an attribute)
        String empId=empIdField.getAttribute("value");

        WebElement saveButton=driver.findElement(By.id("btnSave"));
        saveButton.click();

        WebElement employeeListButton=driver.findElement(By.id("menu_pim_viewEmployeeList"));
        employeeListButton.click();



        //Setup a boolean value as true with while loop to find designated employee
        boolean flag=true;
        while (flag) {
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {//Iterate windows do can move back and forth
                //getting text as String and save
                String rowText = tableRows.get(i).getText();
                if (rowText.contains(empId)) {
                    flag = false;

                    //getting single row that's why we're using findElement instead of findElements
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[" + i + "]/td[1]"));
                                                                    //"i" because we don't know where is my employee is
                    checkBox.click();
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                    break;

                }

            }
            if (flag) {
                //need to click outside the for loop but inside while loop
                WebElement nextButton = driver.findElement(By.linkText("Next"));
                nextButton.click();

            }


        }


    }
}