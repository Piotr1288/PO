package com.company;

public class Main {

    public static void main(String[] args) throws BlednawartoscdlaSilniException {
        System.out.println(silnia(-3));
    }
    public static int silnia(int x) throws BlednawartoscdlaSilniException {
        int wynik = 1;
        if (x <= 0) {
            throw new BlednawartoscdlaSilniException("Podaj liczbe wieksza od 0");
        } else {
            for (int i = 1; i <= x; i++) {
                wynik *= i;
            }
        }

        return wynik;
    }
    }

