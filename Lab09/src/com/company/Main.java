package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Uczestnicy uczestnicy = new Uczestnicy();
        uczestnicy.addUczestnik(1, "Piotrek", 21);
        uczestnicy.addUczestnik(2, "Kacper", 15);
        uczestnicy.addUczestnik(3, "Mikołaj", 18);
        uczestnicy.addUczestnik(4, "Paweł", 17);
        for (Object k : uczestnicy.getUczestnicy()) {
            System.out.println(k.toString());
        }

        List<Integer> liczby = new LinkedList<>();
        List<Integer> Sliczby= new LinkedList<>();
        for (int i = 1; i <=10; i++) {
            liczby.add(i);
        }
        ListIterator<Integer> i = liczby.listIterator(liczby.size());
        while (i.hasPrevious()) {
            Sliczby.add(i.previous());
        }
        for (Object I: liczby) {
            System.out.println(I);
        }
        for (Object J:Sliczby) {
            System.out.println(J);
        }
    }
}
