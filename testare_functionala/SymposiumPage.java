import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SymposiumPage {
    //Symposium test
    public SelenideElement dropDownList1 = $(By.id("DropDownList1"));
    public SelenideElement tbFirstName = $(By.id("tb_first_name"));
    public SelenideElement tbLastName = $(By.id("tb_last_name"));
    public SelenideElement dropDownList5 = $(By.id("DropDownList5"));
    public SelenideElement dropDownList6 = $(By.id("DropDownList6"));
    public SelenideElement tbAddress = $(By.id("tb_address"));
    public SelenideElement tbStreet = $(By.id("tb_street"));
    public SelenideElement tbNumber = $(By.id("tb_number"));
    public SelenideElement tbCity = $(By.id("tb_city"));
    public SelenideElement tbState = $(By.id("tb_state"));
    public SelenideElement tbZip = $(By.id("tb_zip"));
    public SelenideElement dropDownList7 = $(By.id("DropDownList7"));
    public SelenideElement tbPhone = $(By.id("tb_phone"));
    public SelenideElement tbEmail = $(By.id("tb_email"));
    public SelenideElement tbFax = $(By.id("tb_fax"));
    public SelenideElement dropDownList2 = $(By.id("DropDownList2"));
    public SelenideElement dropDownList3 = $(By.id("DropDownList3"));
    public SelenideElement dropDownList4 = $(By.id("DropDownList4"));
    public SelenideElement tbCardNumber = $(By.id("tb_card_number"));
    public SelenideElement tbExpiration = $(By.id("tb_expiration"));
    public SelenideElement tbComments = $(By.id("tb_comments"));
    public SelenideElement button1 = $(By.id("Button1"));
    public SelenideElement label1 = $(By.id("Label1"));
}
