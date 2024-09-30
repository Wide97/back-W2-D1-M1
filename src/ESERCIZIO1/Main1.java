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

        try {


        System.out.println("Inserisci la posizione del numero che vuoi aggiornare: ");
        int posizione = scanner.nextInt();

        if (posizione == 0){
            System.out.println("Programma terminato");
            scanner.close();
            return;
        }

        System.out.println("Inserisci il numero che vuoi aggiornare : ");
        int nuovoNumero = scanner.nextInt();

        numeriCasuali[posizione - 1] = nuovoNumero;

        System.out.println("nuovo stato dell' Array: ");
        for (int numero : numeriCasuali) {
            System.out.println(numero);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("errore: la posizione inserita è fuori limite");
        } catch (Exception e) {
            System.out.println("Errore: si è verificato un problema ");
        } finally {
            scanner.close();
            System.out.println("Scanner chiuso");
        }

    }
}
