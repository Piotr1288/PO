package com.company;

import java.util.Scanner;

public class Samochod {
    public String marka,model,nadwozie,kolor;
    public int rokProdukcji;
    public double przebieg;
    Scanner input = new Scanner(System.in);

    public Samochod() {
        System.out.println("Podaj marke: ");
        this.marka = input.nextLine();
        System.out.println("Podaj model: ");
        this.model = input.nextLine();
        System.out.println("Podaj nadwozie: ");
        this.nadwozie = input.nextLine();
        System.out.println("Podaj kolor: ");
        this.kolor = input.nextLine();
        System.out.println("Podaj rok produkcji: ");
        this.rokProdukcji = input.nextInt();
        do {
            System.out.println("Podaj przebieg: ");
            this.przebieg = input.nextDouble();
        } while (this.przebieg < 0);
        input.nextLine();
    }

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        if(przebieg < 0) {
            this.przebieg = 0;
        }else {
            this.przebieg = przebieg;
        }
    }

    public void opis() {
        System.out.println("Samochód " + this.marka +" Model: " + this.model +
                " Nadwozie: " + this.nadwozie + ", " + "Kolor: " + this.kolor +
                " Rok: " + this.rokProdukcji + " Przebieg: " + this.przebieg);
    }


}
