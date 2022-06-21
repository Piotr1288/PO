package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Odczyt {
    Scanner input= new Scanner(System.in);
    public void OdczytzPliku() throws IOException {
        System.out.println("Podaj scieżkę: ");
        String plik = input.nextLine();

        try {
            FileReader odczyt = new FileReader(plik);
            input = new Scanner(odczyt);

            int i = 0;
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
                i++;
            }

            System.out.println("Ilość linii w pliku: " + i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
