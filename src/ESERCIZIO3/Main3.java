package ESERCIZIO3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del titolare del conto: ");
        String titolare = scanner.nextLine();

        System.out.print("Inserisci il saldo iniziale: ");
        double saldoIniziale = scanner.nextDouble();

        System.out.print("Inserisci il massimo prelievo consentito: ");
        double maxPrelievo = scanner.nextDouble();

        ContoOnline contoOnline = new ContoOnline(titolare, saldoIniziale, maxPrelievo);

        boolean continua = true;
        while (continua) {
            System.out.println("\n1. Preleva\n2. Deposita\n3. Stampa saldo\n0. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci l'importo da prelevare: ");
                    double importoPrelievo = scanner.nextDouble();
                    contoOnline.preleva(importoPrelievo);
                    break;
                case 2:
                    System.out.print("Inserisci l'importo da depositare: ");
                    double importoDeposito = scanner.nextDouble();
                    contoOnline.deposita(importoDeposito);
                    break;
                case 3:
                    contoOnline.stampaSaldo();
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }


        scanner.close();
        System.out.println("Programma terminato.");
    }
}
