package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MycoursedemyPage;
import utilities.ConfigReader;

public class MycoursedemyStepDefinitions {

    MycoursedemyPage mycoursedemyPage=new MycoursedemyPage();

    @Then("myCourse anasayfa login linkine tiklar")
    public void my_course_anasayfa_login_linkine_tiklar() {
        mycoursedemyPage.loginLinki.click();
    }

    @Then("myCourse kullanici adi olarak {string} girer")
    public void my_course_kullanici_adi_olarak_girer(String verilenEmail) {
        mycoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(verilenEmail));
    }
    @Then("myCourse password olarak {string} girer")
    public void my_course_password_olarak_girer(String verilenPassword) {
        mycoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(verilenPassword));
    }

    @Then("myCourse login butonuna basar")
    public void my_course_login_butonuna_basar() {
        mycoursedemyPage.loginButonu.click();
    }

    @Then("myCourse giris yapabildigini test eder")
    public void my_course_giris_yapabildigini_test_eder() {
        Assert.assertTrue(mycoursedemyPage.coursesLinki.isDisplayed());
    }

    @And("cookies butonuna basar")
    public void cookiesButonunaBasar() {
        mycoursedemyPage.cookies.click();
    }


    @Then("myCourse giris yapilamadigini test eder")
    public void mycourseGirisYapilamadiginiTestEder() {
        Assert.assertTrue(mycoursedemyPage.loginLinki.isDisplayed());
    }

}
