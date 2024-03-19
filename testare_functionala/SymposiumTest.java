import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SymposiumTest {
    SymposiumPage symposiumPage = new SymposiumPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
    }
    @BeforeEach
    public void setUp() {
        open("http://collaborative.ase.ro/files/Default.aspx");
    }

    @Test
    public void fillAndTest() {
        symposiumPage.dropDownList1.sendKeys("Dr.");
        sleep(1000);
        symposiumPage.tbFirstName.sendKeys("Cristian");
        sleep(1000);
        symposiumPage.tbLastName.sendKeys("CIUREA");
        sleep(1000);
        symposiumPage.dropDownList5.sendKeys("University professor");
        sleep(1000);
        symposiumPage.dropDownList6.sendKeys("Economic informatics");
        sleep(1000);
        symposiumPage.tbAddress.sendKeys("Bucharest");
        sleep(1000);
        symposiumPage.tbStreet.sendKeys("Calea Dorobanti");
        sleep(1000);
        symposiumPage.tbNumber.sendKeys("1517");
        sleep(1000);
        symposiumPage.tbCity.sendKeys("Bucharest");
        sleep(1000);
        symposiumPage.tbState.sendKeys("Bucharest");
        sleep(1000);
        symposiumPage.tbZip.sendKeys("010552");
        sleep(1000);
        symposiumPage.dropDownList7.sendKeys("Romania");
        sleep(1000);
        symposiumPage.tbPhone.sendKeys("0213191900");
        sleep(1000);
        symposiumPage.tbEmail.sendKeys("cristianciurea@ase.ro");
        sleep(1000);
        symposiumPage.tbFax.sendKeys("0213191991");
        sleep(1000);
        symposiumPage.dropDownList2.sendKeys("No");
        sleep(1000);
        symposiumPage.dropDownList3.sendKeys("Students - 100 euro");
        sleep(1000);
        symposiumPage.dropDownList4.sendKeys("Visa");
        sleep(1000);
        symposiumPage.tbCardNumber.sendKeys("1234567890123456");
        sleep(1000);
        symposiumPage.tbExpiration.sendKeys("1223");
        sleep(1000);
        symposiumPage.tbComments.sendKeys("No comments");
        sleep(1000);
        symposiumPage.button1.click();
        sleep(1000);
        symposiumPage.label1.shouldBe(Condition.visible);
        System.out.println("Test passed!");
    }

}
