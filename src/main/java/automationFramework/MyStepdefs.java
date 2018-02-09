package main.java.automationFramework;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by matth on 2/9/2018.
 */
public class MyStepdefs {
    @Given("^I am on the demoautwebsite$")
    public void iAmOnTheDemoautwebsite() throws Throwable {

        System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/");

        Thread.sleep(5000);

    }
}
