package SeleniumClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //Storing elements inside the list
        List<WebElement> rowData=driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
        System.out.println(rowData.size());//getting size of rows

        Iterator<WebElement> it=rowData.iterator();//creating iterator to move back & forth the element
        while (it.hasNext()){
            WebElement row= it.next();//getting next element
            String rowText=row.getText();//storing text to get text
            System.out.println(rowText);
        }
        System.out.println("**********************************");

        List<WebElement> colsData=driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
                                                                //*[@id="task-table"] can use this xpath too
        System.out.println(colsData.size());//getting column size
        for (WebElement colData:colsData){//Looping through each Web element
            String colText=colData.getText();//Storing all columns in colText to get text
            System.out.println(colText);
        }
    }
}
