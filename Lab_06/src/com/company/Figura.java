package com.company;

public class Figura extends Punkt{
    Punkt punkt;
    String kolor;


    Figura(){
        punkt = new Punkt(0,0);
    }
    Figura(String kolor){
        this.kolor=kolor;
    }
    Figura(Punkt punkt){
        this.punkt=punkt;
    }
    String getKolor(){
        return kolor;
    }

    @Override
    public String opis() {
        return super.opis();
    }
}