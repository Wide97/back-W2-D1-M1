package ESERCIZIO2;

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Inserisci il numero di chilometri percorsi: ");
            int chilometri = scanner.nextInt();


            System.out.print("Inserisci il numero di litri consumati: ");
            int litri = scanner.nextInt();


            CalcolatoreConsumo2 calcolatore = new CalcolatoreConsumo2();


            int consumo = calcolatore.calcolaConsumo(chilometri, litri);


            System.out.println("Hai fatto " + consumo + " km/litro.");
        } catch (IllegalArgumentException e) {

            System.out.println("Errore: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("Errore: Si è verificato un problema. Riprova.");
        } finally {

            scanner.close();
            System.out.println("Scanner chiuso.");
        }
    }
}

