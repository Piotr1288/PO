package com.company;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod {
    public double waga, pojemnoscSilnika;
    public int iloscOsob;
    private static Scanner input = new Scanner(System.in);

    public SamochodOsobowy() {
        super();
        do{
            System.out.println("Podaj wage: (tony)");
            this.waga = input.nextInt();
        } while (this.waga < 2.0 || this.waga > 4.5);

        do{
            System.out.println("Podaj pojemnosc silnika: ");
            this.pojemnoscSilnika = input.nextDouble();
        } while (this.pojemnoscSilnika < 0.8 || this.pojemnoscSilnika > 3.0);

        System.out.println("Podaj ilosc osob: ");
        this.iloscOsob = input.nextInt();
        input.nextLine();
    }

    @Override
    public void opis() {
        super.opis();
    }
}
