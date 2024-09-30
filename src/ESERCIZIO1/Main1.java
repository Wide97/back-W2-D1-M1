package ESERCIZIO1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        GeneratoreNumeri generatore = new GeneratoreNumeri();

        int[] numeriCasuali = generatore.generaNumeriCasuali();

        System.out.println("Numeri casuali generati:");
        for (int numero : numeriCasuali) {
            System.out.println(numero);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la posizione del numero che vuoi aggiornare: ");
        int posizione = scanner.nextInt();

        System.out.println("Inserisci il numero che vuoi aggiornare : ");
        int nuovoNumero = scanner.nextInt();

        numeriCasuali[posizione] = nuovoNumero;

        System.out.println("nuovo stato dell' Array: ");
        for (int numero : numeriCasuali) {
            System.out.println(numero);
        }

        scanner.close();


    }
}
