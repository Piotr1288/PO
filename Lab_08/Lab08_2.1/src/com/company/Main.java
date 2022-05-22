package com.company;

public class Main {

    public static void main(String[] args) throws BlednawartoscdlaSilniException {
        System.out.println(silnia(-3));
    }
    public static int silnia(int a) throws BlednawartoscdlaSilniException {
        int wynik = 1;
        if (a <= 0) {
            throw new BlednawartoscdlaSilniException("Podaj liczbe wieksza od 0");
        } else {
            for (int i = 1; i <= a; i++) {
                wynik *= i;
            }
        }

        return wynik;
    }
    }

