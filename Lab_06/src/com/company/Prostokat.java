package com.company;

public class Prostokat extends Figura{
    double wys=0, szer=0;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    public Prostokat(String kolor, double wys, double szer) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat(Punkt punkt, double wys, double szer) {
        super(punkt);
        this.wys = wys;
        this.szer = szer;
    }
    public void przesun(float x, float y) {
        this.punkt.przesun(x,y);
    }
    double getPowierzchnia() {
        return (szer * wys);
    }

    @Override
    public String opis() {
        return super.opis();
    }
}
