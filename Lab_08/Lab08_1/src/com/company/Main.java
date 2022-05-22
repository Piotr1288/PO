package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę:");
        Scanner input= new Scanner(System.in);
        double liczba;
        while (true){
            try {
                liczba= input.nextDouble();
                        break;
            }
            catch (InputMismatchException e){
                System.out.println("Podaj poprawną liczbę: ");
                input.next();
            }
        }
        if(liczba<0){
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby %.4f nie istnieje ", liczba));
        }
        System.out.println("Pierwiastek z "+liczba+"wynosi: "+Math.sqrt(liczba));
    }
}
