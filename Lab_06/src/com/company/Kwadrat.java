package com.company;

public class Kwadrat extends Prostokat {
    public double a;

    public Kwadrat(String kolor, double a) {
        super(kolor, a, a);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String opis() {
        return super.opis();
    }
}
