Feature: US1009 Kullanici liste olarak verilen urunleri Amazon'da aratır


  # Amazon anasayfaya gidip Nutella. Java,Apple ,Samsıng,LG icin arama yapip
   #  arama sonuclarinin aranan kelime icerdigini test edin

  Scenario Outline: TC17 Kullanici liste olarak arama testi yapabilmeli

    Given Kullanici "amazonUrl" anasayfaya gider
    Then Arama cubuguna "<istenenKelime>" yazip aratir
    And Arama sonuclarinin "<istenenKelime>" icerdigini test eder


    Examples:
    |istenenKelime|
    |Nutella      |
    |Java         |
    |Apple        |
    |Samsung      |
    |LG           |