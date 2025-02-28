package taskTwo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightWebTwo {

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement frame = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        frame.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement fromArea = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='fromCity']")));
        fromArea.click();
        WebElement from = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));
        from.sendKeys("bang");
        driver.findElement(By.xpath("//span[text() = 'Bengaluru']")).click();

        WebElement toButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='toCity']")));
        toButton.click();
        WebElement to = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='To']")));
        to.sendKeys("Prayagraj");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Prayagraj')]"))).click();


        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String formattedDate = today.format(formatter);

        WebElement todaysDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']/div[@class='dateInnerCell']//p[text()='28']")));
        todaysDate.click();

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Search']")));
        searchButton.click();
    }
}
