package part1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        // Wait for the username input field to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        user.sendKeys("Admin");

        // Wait for the password input field to be visible
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        pass.sendKeys("admin123");

        // Click the login button
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);

        var expectedResult =wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h6"))).getText();
        var actualResult = "Dashboard";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
