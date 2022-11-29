Feature: US1008 Herokuapp Wait Testleri

  Scenario: TC16 Kullanici wait islemlerinin calistigini test eder

    Given Kullanici "herokuUrl" anasayfaya gider
    Then Herokuapp Add Element butonuna basar
    And Herokuapp Delete bıtonu gorunmesini bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Herokuapp Delete butonuna basarak butonu silin
    And Heokuapp Delete butonunun gorunmedigini test edin
    Then Sayfayi kapatir




# Yeni bir sayfada calismaya basladıgımızda
 # 1- Feature dosyasi olusturalım

  #
  #
  #
  #
  #