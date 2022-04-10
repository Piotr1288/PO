package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Budynek {
    String nazwa;
    int pietra;
    int rok_budowy;
    public void wyswietl(){
        System.out.println("Nazwa: "+nazwa+", Ilość pięter: "+pietra+", Rok budowy: "+rok_budowy);
    }
    public static int wiek(int rok_budowy){
    return LocalDateTime.now().getYear() - rok_budowy;
    }
    public Budynek() {
    }
}
