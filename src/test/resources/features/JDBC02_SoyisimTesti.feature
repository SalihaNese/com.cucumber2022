Feature:  JDBC02 kullanici id ile soyisim testi yapar

  Scenario:  TC02 Kullanici id girerek soyisim tesyi yapabilmeli

    Given Kullanici JDBC ile database'e baglanir
    Then id si 14 olan kisinin "last_name" degerinin "Pymar"