package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(2, 5);


        punkt1.przesun(5, 7);
        punkt1.opis();
        punkt1.zeruj();
        punkt2.przesun(3, 1);
        punkt2.opis();
        punkt2.zeruj();

        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat(5, 9);
        Trojkat trojkat = new Trojkat(10.0F, 5.0F);

        figura.getKolor();

        prostokat.getPowierzchnia();

        prostokat.przesun(3, 5);
        prostokat.punkt.opis();

        Kwadrat kwadrat = new Kwadrat("Czerwony", 5);

       figura.opis();
       prostokat.opis();
       trojkat.opis();
       kwadrat.opis();


       /* SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        Samochod samochod = new Samochod();
        Samochod samochod1 = new Samochod("Ford", "Shelby", "Hatchback", "Niebieski", 1966, 100000);

        samochod.opis();
        samochod1.opis();
        samochodOsobowy.opis();*/


    }
}
