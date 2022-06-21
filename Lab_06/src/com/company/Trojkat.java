package com.company;

public class Trojkat extends Figura {
    float wys = 0, podst = 0;

    Trojkat(float wys, float podst) {
        this.wys = wys;
        this.podst = podst;
    }

    public Trojkat(String kolor, float wys, float podst) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    @Override
    public String opis() {
        return super.opis();
    }
}
