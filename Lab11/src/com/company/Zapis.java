package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zapis {
    Scanner input = new Scanner(System.in);

    public void ZapisdoPliku() throws IOException {
        System.out.println("Podaj scieżkę: ");
        String plik = input.nextLine();
        FileWriter zapis = new FileWriter(plik);

        while (true) {
            String text = input.nextLine();
            System.out.println(text);
            if (text.equals("-")) {
                break;
            } else {
                if (text.equals("\n")) {
                    zapis.write(System.lineSeparator());
                    continue;
                }
                zapis.write(text);
            }
        }
        zapis.close();
    }
}
