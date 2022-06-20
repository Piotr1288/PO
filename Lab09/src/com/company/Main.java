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

        List<Integer> numbers = new LinkedList<>();
        List<Integer> numbers2 = new LinkedList<>();
        for (int i = 1; i <=10; i++) {
            numbers.add(i);
        }
        ListIterator<Integer> i = numbers.listIterator(numbers.size());
        while (i.hasPrevious()) {
            numbers2.add(i.previous());
        }
        for (Object I: numbers) {
            System.out.println(I);
        }
        for (Object J:numbers2) {
            System.out.println(J);
        }
    }
}
