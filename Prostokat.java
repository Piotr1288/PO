package com.company;
public class Prostokat {
        double dlugosc;
        double szerokosc;
        public static double obwod(double szerokosc, double dlugosc) {
            double obw;
            obw=dlugosc+szerokosc;
            return obw;
        }
        public static double pole(double szerokosc, double dlugosc) {
            double pol;
            pol=dlugosc*szerokosc;
            return pol;
        }
        public static double przekatna(double szerokosc, double dlugosc) {
            double prk;
            prk=Math.sqrt(Math.pow(szerokosc,2)+Math.pow(dlugosc,2));
            return prk;
        }

        public Prostokat() {
        }

    }

