package main.java.automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

/**
 * Created by matth on 2/9/2018.
 */
public class firstTest {
    public static void main(String [] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/");

        Thread.sleep(5000);

        System.out.println("Successfully opened the website http://newtours.demoaut.com/");

        driver.findElement(By.name("userName")).sendKeys("Pino");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("login")).click();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement CheckboxTypeoneWay = driver.findElement(By.cssSelector("input[value='oneway']"));

        CheckboxTypeoneWay.click();

        //driver.get("http://newtours.demoaut.com/mercuryreservation.php");

        // select passenger count

        CheckboxTypeoneWay.click();

        driver.findElement(By.name("passCount")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);

        driver.findElement(By.name("fromPort")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);

        //select month

        driver.findElement(By.name("fromMonth")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);

        //
        driver.findElement(By.name("toPort")).sendKeys( Keys.DOWN, Keys.ENTER);

        //select day

        driver.findElement(By.name("fromDay")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);

        driver.findElement(By.name("toMonth")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);

        driver.findElement(By.name("toDay")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);



        WebElement CheckBoxBusinessclass1 = driver.findElement(By.cssSelector("input[value='Business']"));

        driver.findElement(By.name("airline")).sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);

        CheckBoxBusinessclass1.click();

        driver.findElement(By.name("findFlights")).click();

        //webpage flight selection

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //WebElement selectTicket = driver.findElement(By.cssSelector("input[value='Blue Skies Airlines$361$271$7:10']"));

        //selectTicket.click();

        //WebElement selectTicket2 = driver.findElement(By.cssSelector("input[value=' Blue Skies Airlines$631$273$14:30']"));

        //selectTicket2.click();

        driver.findElement(By.name("reserveFlights")).click();

        //passenger details
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.findElement(By.name("passFirst0")).sendKeys("Pino");
        driver.findElement(By.name("passLast0")).sendKeys("Sesam");
        driver.findElement(By.name("passFirst1")).sendKeys("Tommy");
        driver.findElement(By.name("passLast1")).sendKeys("Sesam");
        driver.findElement(By.name("passFirst2")).sendKeys("Inie Minie");
        driver.findElement(By.name("passFirst3")).sendKeys("Sesam");

        driver.findElement(By.name("creditnumber")).sendKeys("ikhebmoneyG");

        driver.findElement(By.name("buyFlights")).click();

        if(driver.getPageSource().contains("New York to Frankfurt"))
        {
            System.out.println("Text is Present");
        }
        else
        {
            System.out.println("Text is not Present");
        }

        if(driver.getPageSource().contains("Fout test"))
        {
            System.out.println("Text is Present");
        }
        else
        {
            System.out.println("Text is not Present");
        }


        //driver.findElement(By.xpath("//input[@value='oneWay']")).click();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // Close the driver
        //driver.quit();
    }

    // TODO Auto-generated method stub

}






