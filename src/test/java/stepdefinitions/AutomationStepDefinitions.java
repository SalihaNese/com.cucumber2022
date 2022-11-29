package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Action;
import pages.AutomationPage;

public class AutomationStepDefinitions {
    AutomationPage automationPage=new AutomationPage();

    @Given("user signUp linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationPage.signUpLinki.click();

    }
    @Given("New user bölümüne name ve email adresi girer")
    public void new_user_bölümüne_name_ve_email_adresi_girer() {
        automationPage.isimKutusu.sendKeys("Nese");
        automationPage.emailKutusu.sendKeys("abcde@gmail.com");

    }
    @Given("SignUp butonuna basar")
    public void sign_up_butonuna_basar() {

        automationPage.signUpButoon.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {



    }
    @Given("user create account butonuna basar")
    public void user_create_account_butonuna_basar() {

        automationPage.createAccountButonu.click();

    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {

    }
}
