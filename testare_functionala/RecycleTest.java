import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class RecycleTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://collaborative.ase.ro/recycle/");
        driver.manage().window().maximize();
    }

    @Test
    public void testRecycle() {
        driver.findElement(By.xpath("//table[@id='Q1']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q2']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.id("tb_Q3")).sendKeys("12");
        sleep(2000);
        driver.findElement(By.id("tb_Q4")).clear(); //cand se declanseaza evenimente in pagina la click in textbox
        driver.findElement(By.id("tb_Q4")).click();
        driver.findElement(By.id("tb_Q4")).sendKeys("6");
        sleep(2000);
        driver.findElement(By.id("tb_Q5")).clear(); //cand se declanseaza evenimente in pagina la click in textbox
        driver.findElement(By.id("tb_Q5")).click();
        driver.findElement(By.id("tb_Q5")).sendKeys("3");
        sleep(2000);
        driver.findElement(By.xpath("//table[@id='Q6']/tbody/tr/td/label")).click();
        sleep(2000);
        driver.findElement(By.xpath("//table[@id='Q7']/tbody/tr/td/label")).click();
        sleep(2000);
        driver.findElement(By.xpath("//table[@id='Q8']/tbody/tr/td/label")).click();
        sleep(2000);
        driver.findElement(By.xpath("//table[@id='Q9']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q10']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q11']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q12']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q13']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q14']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q15']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q16']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q17']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q18']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q19']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q20']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.id("tb_20_a")).sendKeys("2");
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q21']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.id("tb_21_a")).sendKeys("2");
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q22']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q23']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.id("tb_23_a")).sendKeys("2");
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q24']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q25']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q26']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.id("tb_26_a")).sendKeys("2");
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q27']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.id("tb_27_a")).sendKeys("2");
        sleep(1000);
        driver.findElement(By.xpath("//table[@id='Q28']/tbody/tr/td/label")).click();
        sleep(1000);
        driver.findElement(By.id("Button1")).click();
        sleep(1000);
        Alert a = driver.switchTo().alert();
        a.accept();
        sleep(1000);
        driver.findElement(By.id("Button2")).click();
        sleep(1000);
        driver.close();
        System.out.println("Test passed!");
    }
}
