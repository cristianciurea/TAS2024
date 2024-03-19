
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MulticriteriaAnalysisPage {

    @Before
    public void setUp() {
        Selenide.open("http://collaborative.ase.ro/Pasul1.0.aspx");
    }

    @Test
    public void testAllSteps() {
        //check the second radiobutton
        $(By.id("RadioButton2")).click();
        sleep(5000);
        // ------------------------------------------
        // navigate to next step (Pasul 1.2)
        $(By.id("Button1")).click();
        sleep(5000);
        // check the 1, 5, 10 elements from CheckBoxList
        $(By.id("CheckBoxList1_0")).click();
        $(By.id("CheckBoxList1_4")).click();
        $(By.id("CheckBoxList1_9")).click();
        sleep(5000);
        // select items 1.1, 1.3, 1.10 from ListBox
        Select select = new Select($(By.id("ListBox1")));
        select.selectByValue("1.1. Aparate frigorifice de mari dimensiuni");
        select.selectByValue("1.3. Aparate frigorifice / Congelatoare");
        select.selectByValue("1.10. Plite electrice");
        sleep(5000);
        // ------------------------------------------
        // navigate to next step (Pasul 2)
        $(By.id("Button1")).click();
        sleep(5000);
        // check the second element from CheckBoxList (CRITERII ECOLOGICE)
        $(By.id("CheckBoxList1_1")).click();
        sleep(5000);
        // select items 2.2, 2.7 from ListBox
        select = new Select($(By.id("ListBox1")));
        select.selectByValue("2.2. Volumul (cantitatea) de DEEE tratate");
        select.selectByValue("2.7. Consumul de energie pe unitatea de DEEE reciclat");
        sleep(5000);
        // ------------------------------------------
        // navigate to next step (Pasul 3)
        $(By.id("Button1")).click();
        sleep(5000);
        // fill in the textboxes
        $(By.id("TextBox00")).sendKeys("1");
        $(By.id("TextBox01")).sendKeys("2");
        $(By.id("TextBox10")).sendKeys("3");
        $(By.id("TextBox11")).sendKeys("4");
        $(By.id("TextBox20")).sendKeys("5");
        $(By.id("TextBox21")).sendKeys("6");
        sleep(5000);
        // ------------------------------------------
        // navigate to next step (Pasul 4)
        $(By.id("Button1")).click();
        sleep(5000);
        // ------------------------------------------
        // navigate to next step (Pasul 5)
        $(By.id("Button1")).click();
        sleep(5000);
        // fill in the textbox and click the button
        $(By.name("ctl21")).sendKeys("9");
        sleep(5000);
        $(By.name("ctl25")).click();
        sleep(5000);
        // ------------------------------------------
        // navigate to next step (Pasul 6)
        $(By.id("Button1")).click();
        sleep(5000);
        // export results in Word
        $(By.id("Button1")).click();
        sleep(5000);
    }
}


