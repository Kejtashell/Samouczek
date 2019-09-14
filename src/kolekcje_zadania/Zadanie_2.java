package kolekcje_zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie_2 {

    // Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi imienia „-”,
    // następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych imion
    // i wyświetl imię odpowiadającego mu partnera.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Map mapaPar = new HashMap();


        String on;
        String ona;

        System.out.println("Wprowadź imię partnera a następnie partnerki: ");

        do {
            on = scanner.nextLine();
            ona = scanner.nextLine();

            if (on.equals(Zadanie_1.koniec) || ona.equals(Zadanie_1.koniec)) {
                break;
            }

            if (!on.equals(Zadanie_1.koniec) && !ona.equals(Zadanie_1.koniec)) {
                mapaPar.put(on, ona);
            }
        }
        while (!on.equals(Zadanie_1.koniec) || !ona.equals(Zadanie_1.koniec));

        System.out.println("Podaj imię jednego z partnerów:");

       // System.out.println(mapaPar.get(scanner.nextLine()));
        String onKlucz = scanner.nextLine();

        System.out.println(onKlucz + " i " + mapaPar.get(onKlucz) + " to śmieszna parka.");

    }

}
