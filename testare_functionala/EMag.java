import java.time.Duration;
import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.sleep;

public class EMag {
  private WebDriver driver;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.http.factory", "jdk-http-client");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.get("https://www.emag.ro/");
    driver.manage().window().maximize();
  }

  @Test
  public void testEMag() throws Exception {

    driver.findElement(By.id("searchboxTrigger")).click();
    sleep(1000);
    driver.findElement(By.id("searchboxTrigger")).clear();
    sleep(1000);
    driver.findElement(By.id("searchboxTrigger")).sendKeys("cafea tassimo");
    sleep(1000);
    driver.findElement(By.id("searchboxTrigger")).sendKeys(Keys.ENTER);
    sleep(1000);

    WebElement webElement = new WebDriverWait(driver, Duration.ofSeconds(5)).until(
            ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Capsule cafea Tassimo Morning Cafe, Big pack, 21 bauturi x 215 ml")));
    Assertions.assertEquals("Capsule cafea Tassimo Morning Cafe, Big pack, 21 bauturi x 215 ml", webElement.getText());

    String actualTitle = webElement.getText();
    String expectedTitle = "Capsule cafea Tassimo Morning Cafe, Big pack, 21 bauturi x 215 ml";

    if(actualTitle.equalsIgnoreCase(expectedTitle)) {
      System.out.println("Test passed! Am gasit Capsule cafea Tassimo Morning Cafe, Big pack, 21 bauturi x 215 ml!");
      driver.findElement(By.xpath("//img[@alt='Capsule cafea Tassimo Morning Cafe, Big pack, 21 bauturi x 215 ml']")).click();
      sleep(1000);
      driver.findElement(By.xpath("//div[@id='main-container']/section[3]/div/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div[2]/div/button")).click();
      sleep(1000);
      driver.findElement(By.linkText("Vezi detalii cos")).click();
      sleep(1000);
      driver.findElement(By.xpath("//div[@id='cart-products']/div/div/div[5]/div/div/div[2]/div[2]/div/div/div/button[2]/i")).click();
      sleep(1000);
      driver.findElement(By.xpath("//div[@id='cart-products']/div/div[2]/div/div/div[2]/div/a")).click();
      sleep(1000);
      driver.quit();
      System.out.println("Test passed!");
    }
    else {
      System.out.println("Test failed!");
      driver.quit();
    }
  }
}
