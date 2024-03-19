import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;

public class ToolTipTest {

    WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp(){

        driver.get("http://jqueryui.com/tooltip/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void testToolTip()
    {
       WebElement frame =  driver.findElement(By.className("demo-frame"));
       driver.switchTo().frame(frame);

       WebElement ageField = driver.findElement(By.id("age"));

       Actions action = new Actions(driver);
       action.moveToElement(ageField).perform();

        WebElement toolTipElem = new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.visibilityOfElementLocated((By.className("ui-tooltip-content"))));

        Assertions.assertEquals("We ask for your age only for statistical purposes.", toolTipElem.getText());

        sleep(5000);
        driver.close();
        System.out.println("Test passed!");
    }
}
