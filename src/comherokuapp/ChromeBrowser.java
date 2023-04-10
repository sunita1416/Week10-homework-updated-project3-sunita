package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        // Set up Chrome Browser

        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title of the page
       String title = driver.getTitle();
        System.out.println(title);

        // Print the current URL

        driver.getCurrentUrl();
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source:" + driver.getPageSource());

        // Enter username in username field
        WebElement usernameField =  driver.findElement(By.id("username"));
        usernameField.sendKeys("PrimeTesting");

        // Enter password to password field

        driver.findElement(By.id("password")).sendKeys("abc1234");

        // Close the browser
        //driver.close

    }
}
