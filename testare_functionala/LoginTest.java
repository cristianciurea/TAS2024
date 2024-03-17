import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        //pentru Java 11+
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("http://cristianciurea.ase.ro/ruby/Login.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin(){

        driver.findElement(By.name("Username")).sendKeys("cristi");
        sleep(2000);

        driver.findElement(By.name("Password")).sendKeys("cristi");
        sleep(2000);

        driver.findElement(By.name("Login")).click();
        sleep(2000);

        Alert a = driver.switchTo().alert();
        if(a.getText().equalsIgnoreCase("Your username is: cristi"))
        {
            sleep(2000);
            a.accept();
            System.out.println("Test Passed! Login successful!");
        }
        else
        {
            sleep(2000);
            a.dismiss();
            System.out.println("Test Failed!");
        }
        driver.close();
    }
}
