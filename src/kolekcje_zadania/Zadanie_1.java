package kolekcje_zadania;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Zadanie_1 {


   // Napisz program, który będzie pobierał od użytkownika imiona.
    // Program powinien pozwolić użytkownikowi na wprowadzenie dowolnej liczby imion
    // (wprowadzenie „-” jako imienia przerwie wprowadzanie).
    // Na zakończenie wypisz liczbę unikalnych imion

    final static String koniec = "-";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set <String> listaImion = new HashSet<>();

        System.out.println("Wpisuj imiona po kolei. Aby zakończyć wpisz '-' ");

        String imie;

        do {
            imie = scanner.nextLine();

            if (!imie.equals(koniec)) {
                listaImion.add(imie);

            }
        }

        while (!koniec.equals(imie));



        for (String s : listaImion) {
            System.out.println(s);
        }

    }


}
