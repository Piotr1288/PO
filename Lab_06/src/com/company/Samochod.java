package com.company;

import java.util.Scanner;

public class Samochod {
    public String marka,model,nadwozie,kolor;
    public int rokProdukcji;
    public double przebieg;
    public static Scanner scanner = new Scanner(System.in);

    public Samochod() {
        System.out.println("Podaj marke: ");
        this.marka = scanner.nextLine();
        System.out.println("Podaj model: ");
        this.model = scanner.nextLine();
        System.out.println("Podaj nadwozie: ");
        this.nadwozie = scanner.nextLine();
        System.out.println("Podaj kolor: ");
        this.kolor = scanner.nextLine();
        System.out.println("Podaj rok produkcji: ");
        this.rokProdukcji = scanner.nextInt();
        do {
            System.out.println("Podaj przebieg: ");
            this.przebieg = scanner.nextDouble();
        } while (this.przebieg < 0);
        scanner.nextLine();
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
