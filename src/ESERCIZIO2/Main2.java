package ESERCIZIO2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km: ");
            double chilometri = scanner.nextDouble();

            System.out.println("inserisci il numero di litri: ");
            double litri = scanner.nextDouble();

            CalcolatoreConsumo calcolatore = new CalcolatoreConsumo();

            double consumo = calcolatore.calcolaConsumo(chilometri, litri);

            System.out.println("Hai fatto " + consumo + " km/ litro ");
        } catch (IllegalArgumentException e) {
            System.out.println("errore: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore");
        } finally {
            scanner.close();
            System.out.println("Scanner chiuso");
        }

    }
}
