package com.company;

import java.io.*;
import java.util.Scanner;

public class ZapisBinarny {
    Scanner input = new Scanner(System.in);
    String plik = input.nextLine();
    public void BinarnyZapis() throws IOException {
        System.out.println("Dzień: ");
        int dzien = input.nextInt();
        System.out.println("Miesiąc: ");
        int miesiac = input.nextInt();
        System.out.println("Rok: ");
        int rok = input.nextInt();

        try (DataOutputStream dataoutput = new DataOutputStream(new FileOutputStream(plik))) {
            dataoutput.writeInt(dzien);
            dataoutput.writeInt(miesiac);
            dataoutput.writeInt(rok);
        }
    }

    public void BinarnyOdczyt() throws IOException {

        DataInputStream datainput = new DataInputStream(new FileInputStream(plik));

        while(datainput.available() > 0){
            System.out.println(datainput.readInt());
        }

        datainput.close();
    }
}
