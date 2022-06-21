package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       Zapis zapis = new Zapis();
       zapis.ZapisdoPliku();

     Odczyt odczyt = new Odczyt();
     odczyt.OdczytzPliku();

            ZapisBinarny zapisB = new ZapisBinarny();
           zapisB.BinarnyZapis();

           zapisB.BinarnyOdczyt();
        }
    }

