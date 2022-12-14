package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)  // cucumber'ı runner'da aktıf ediyor
    @CucumberOptions(
            plugin={"html:target/cucumber-reports.html",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml"
            },

            features = "src/test/resources/features", // feature dosyalarının nerde oldugunu gosteriri
            glue="stepdefinitions", //features'da yazdıgımız dosyalari gosterir
            tags= "@wip",//work ın progres su anda uzerinde calistıgımıx dosyalar demek
            dryRun =false
    )


    public class TestRunnerIlk {

    /*
    Bir framework'de bir tek Runner class'i yeterli olabilir
    Runner class'inda class body'sinde hic bir sey olmaz
    Runner class'imizi onemli yapan 2 adet annotaion vardir
    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz
    features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue : step definitions dosyalarini nerede bulacagimizi gosterir
    tags : o an hangi tag'i calistirmak istiyorsak onu belli eder

   dryRun : iki secenek var

   dryRun=true; yazdigimizda Testimizi calistirmadan sadece eksik adimlari bize verir
   eksik adim yoksa, testi calistirmadan test passed yazar

   deyRun=false yazdigimizda testlerimizi calistirir
   eksik adim varsa , ilk eksik adimda calismayi durdurur ve
   eksik adimlari bize verir
     */
}


