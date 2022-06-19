package com.company;

public class Wieloryb extends Zwierze {
    @Override
    public void wydala() {
        System.out.println("Wieloryb wydala ");
    }


    @Override
    public void plyn() {
        super.plyn();
        System.out.println("Wieloryb płynie");
    }

    @Override
    public void wynurz() {
        super.wynurz();
        System.out.println("Wieloryb wynurza sie");
    }

    @Override
    public void zanurz() {
        super.zanurz();
        System.out.println("Wieloryb zanurza się");
    }

}
