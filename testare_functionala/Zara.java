import java.time.Duration;
import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.sleep;

public class Zara {
  private WebDriver driver;

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.http.factory", "jdk-http-client");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.get("https://www.zara.com/ro/");
    driver.manage().window().maximize();
  }

  @Test
  public void testZara() throws Exception {

    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    sleep(1000);
    driver.findElement(By.linkText("Căutare")).click();
    sleep(1000);
    driver.findElement(By.id("search-products-form-combo-input")).clear();
    sleep(1000);
    driver.findElement(By.id("search-products-form-combo-input")).sendKeys("pantaloni");
    sleep(1000);
    driver.findElement(By.cssSelector(".search-products-form")).submit();
    sleep(1000);
    driver.findElement(By.xpath("//main[@id='main']/article/div/div/section/div[2]/section/ul/li[5]/div[2]/div/div/div/div/a/h2")).click();
    sleep(1000);
    driver.findElement(By.xpath("//li[@id='product-size-selector-340768869-item-3']/div")).click();
    sleep(1000);
    driver.findElement(By.xpath("//main[@id='main']/article/div/div/div[2]/div/div[3]/div/div/button/div/span")).click();
    sleep(1000);
    driver.findElement(By.xpath("//html[@id='product-340766015']/body/div[5]/div[2]/div/div[2]/div/button/div/span")).click();
    sleep(1000);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Albastru deschis'])[1]/following::*[name()='svg'][2]")).click();
    sleep(1000);
    driver.findElement(By.xpath("//main[@id='main']/article/div[2]/div/div/div/div[2]/section/div[3]/button/div")).click();
    sleep(1000);
    driver.quit();
    System.out.println("Test passed!");
  }
}
