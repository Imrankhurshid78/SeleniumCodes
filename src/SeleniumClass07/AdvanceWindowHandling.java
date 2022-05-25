package SeleniumClass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandling {
    /*click on button and open new window or tabs
    switch to window and perform different action

     */

    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle=driver.getWindowHandle();
        WebElement igButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement  igAndFbButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));

        igButton.click();
        fbButton.click();
        igAndFbButton.click();

        Set<String> allWindowsHandle=driver.getWindowHandles();//Storing all windows in SET container to handle
        System.out.println(allWindowsHandle.size());
        Iterator<String> it=allWindowsHandle.iterator();//to move all windows back & forth

        while (it.hasNext()){//best way to iterator always using while loop
            String handle=it.next();
            if(!mainPageHandle.equals(handle)){//set a condition

            driver.switchTo().window(handle);//switch to a window which is not equal to main page handle
            //driver.manage().window().maximize();
            String title=driver.getTitle();
            System.out.println(title);
            driver.close();
        }
}
        driver.switchTo().window(mainPageHandle);//Switch back to Parent handle
        igAndFbButton.click();
}}