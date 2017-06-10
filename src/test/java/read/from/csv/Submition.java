package read.from.csv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Osanda on 10/4/2016.
 */
public class Submition {
    static String ROOT = System.getProperty("user.dir");

    public static void submitElementsSetOfALineInCSV(int i){

        String fileLocation = ROOT + "\\data.csv";
        System.setProperty("webdriver.chrome.driver", ROOT + "\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercuryregister.php");

        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,0,i));
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,1,i));
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,2,i));
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,3,i));
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,4,i));
        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,5,i));
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,6,i));
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,7,i));
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,8,i));
        Select select = new Select(driver.findElement(By.xpath("//select[@name='country']"))); select.selectByVisibleText("ALGERIA");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,10,i));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,11,i));
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(ReadFromCsv.readFromCsv(fileLocation,12,i));
        driver.findElement(By.xpath("//input[@name='register']")).click();
    }

}
