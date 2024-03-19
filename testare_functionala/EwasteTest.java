import java.time.Duration;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.Selenide.sleep;

public class EwasteTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://collaborative.ase.ro/ewaste/");
        driver.manage().window().maximize();
    }

    @Test
    public void testEwaste() {

        driver.findElement(By.id("tb_denumire")).sendKeys("ASE");
        sleep(1000);
        driver.findElement(By.id("tb_domeniu")).sendKeys("Education");
        sleep(1000);
        driver.findElement(By.id("tb_functie")).sendKeys("Profesor");
        sleep(1000);
        driver.findElement(By.id("CheckBoxList1_3")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList2_0")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList3_0")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList4_2")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList5_0")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList5_1")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList5_3")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList6_0")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList6_2")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList7_1")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList8_1")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList9_0")).click();
        sleep(1000);
        driver.findElement(By.id("CheckBoxList10_0")).click();
        sleep(1000);
        driver.findElement(By.id("tb_solutii")).sendKeys("o multime");
        sleep(1000);
        driver.findElement(By.id("tb_costuri")).sendKeys("999999");
        sleep(1000);
        driver.findElement(By.id("tb_rezultate")).sendKeys("multe rezultate");
        sleep(1000);
        driver.findElement(By.id("CheckBoxList11_0")).click();
        sleep(1000);
        driver.findElement(By.id("Button1")).click();
        sleep(1000);
        driver.findElement(By.id("Button2")).click();
        sleep(1000);
        driver.findElement(By.id("HyperLink1")).click();
        sleep(1000);
        driver.close();
        System.out.println("Test passed!");
    }
}
