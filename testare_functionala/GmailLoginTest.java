import com.codeborne.selenide.selector.ByText;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;
import static com.codeborne.selenide.Selenide.sleep;

public class GmailLoginTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        //pentru Java 11+
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() {
        driver.findElement(By.id("identifierId")).sendKeys("dorel@gmail.com");
        sleep(2000);
        driver.findElement(new ByText("Next")).click();
        sleep(2000);

        WebElement webElement = new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.visibilityOfElementLocated(By.className("o6cuMc")));
        Assertions.assertEquals("Couldn’t find your Google Account", webElement.getText());

        String actualTitle = webElement.getText();
        String expectedTitle = "Couldn’t find your Google Account";
        driver.close();

        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Test passed! The email address doesn't exist!");
        else
            System.out.println("Test failed!");
    }
}
