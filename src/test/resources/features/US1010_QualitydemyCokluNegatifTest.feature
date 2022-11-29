Feature: US1010 liste olarak verilen wrong user ile negatif login testi

  Scenario Outline:

    Given Kullanici "myUrl"anasayfaya gider
    Then myCourse login butonuna basar
    And myCourse kullanici adi olarak "istenenEmail" girer
    And myCourse password olarak "istenenPassword" girer
    Then myCourse login butonuna basar
    And myCourse giris yapabildigini test eder
    Then Sayfayi kapatir




    Examples:
    |istenenEmail|istenenPassword|