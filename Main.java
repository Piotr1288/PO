package com.company;

public class Main {

    public static void main(String[] args) {
	    Prostokat prost1 = new Prostokat();
        prost1.dlugosc=10;
        prost1.szerokosc=20;
        System.out.println("Pole wynosi: "+prost1.pole(prost1.szerokosc=20,prost1.dlugosc=10));
        System.out.println("Obwód wynosi: "+prost1.obwod(prost1.szerokosc=20,prost1.dlugosc=10));
        System.out.println("Przekątna ma: "+  prost1.przekatna(prost1.szerokosc=20,prost1.dlugosc=10));
        Budynek bud1= new Budynek();
        //
        //
        bud1.nazwa="Kampus";
        bud1.pietra=10;
        bud1.rok_budowy=2002;
        bud1.wyswietl();
        System.out.println("Wiek budynku: "+bud1.wiek(bud1.rok_budowy));
        Budynek bud2= new Budynek();
        bud1.nazwa="Instytut";
        bud1.pietra=8;
        bud1.rok_budowy=2003;
        bud1.wyswietl();
        System.out.println("Wiek budynku: "+bud2.wiek(bud1.rok_budowy));
        Budynek bud3= new Budynek();
        bud1.nazwa="Muzeum";
        bud1.pietra=15;
        bud1.rok_budowy=2005;
        bud1.wyswietl();
        System.out.println("Wiek budynku: "+bud3.wiek(bud1.rok_budowy));
    }
}
