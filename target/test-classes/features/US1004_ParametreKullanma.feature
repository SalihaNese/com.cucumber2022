

Feature: US1004 Parametre Kullanma

  Scenario: TC08 Kullanici parametre ile verilen kelimeyi amazonda aratabilmeli

    Given  Kullanici amazon anasayfaya gider
    Then Arama cubuguna "Tv"yazip aratir
    And Arama sonuclarinin "Tv" icerdigini test eder
    And Sayfayi kapatir