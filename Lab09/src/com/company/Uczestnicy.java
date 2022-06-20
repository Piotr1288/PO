package com.company;

import java.util.ArrayList;
import java.util.List;


public class Uczestnicy {


    private List<Uczestnik> uczestnicy = new ArrayList<>();


    public boolean addUczestnik(int ID, String imie, int wiek) {
        if(wiek >= 18) {
            return this.uczestnicy.add(new Uczestnik(ID, imie, wiek));
        }
        return false;
    }

    public List<Uczestnik> getUczestnicy() {
        return uczestnicy;
    }

    public void setUczestnicy(List<Uczestnik> uczestnicy) {
        this.uczestnicy = uczestnicy;
    }
}
