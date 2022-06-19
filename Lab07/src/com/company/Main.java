package com.company;
public class Main {

    public static void main(String[] args) {
    Statek statek=new Statek();
    Samochod samochod=new Samochod();
    Samolot samolot=new Samolot();
    samolot.leci();
    samochod.jazda();
    statek.plynie();
    Wieloryb wieloryb=new Wieloryb();
    wieloryb.plyn();
    wieloryb.wydala();
    wieloryb.wynurz();
    }
}
