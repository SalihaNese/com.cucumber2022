package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
public class Hooks {

    /*
    TestNG projemizde veya JUnit projemizde
     her classtan veya methodddan once veya sonra
      calismasini istedigimiz method olsaydı

    ya icinde bulundugumuz class'ta bir @Before....@After... olustururduk
    yada extends ile bir class'ı parent edinip
     o class'a @Before....@After...koyuyorduk

     Cucumber'da calısacak methodlar bir class ile sinirli degildir
     stepdefinitions package altındaki tum class'lardaki method'lar calistirilabilir

     Eger bizim butun testlerimiz icin herhangi bir  @Before....@After..
     method'una ihtiyacimiz varsa

      stepdefinitions altinda herhangi bir class'a koymamiz yeterli olacaktir

      Projeler collctif calistigindan
      ekipteki herkesin yerini bulabilmesi icin
      @Before....@After... method'lari kullanilacaksa
      Hooks class'ina konulmasi genel kullanim olarak benimsenmistir
     */


    @After
    public void tearDown(Scenario scenario){

        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }

        //Driver.closeDriver();
    }
}
