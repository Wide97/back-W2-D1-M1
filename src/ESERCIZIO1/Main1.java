package ESERCIZIO1;

public class Main1 {
    public static void main(String[] args) {

        GeneratoreNumeri generatore = new GeneratoreNumeri();

        int[] numeriCasuali = generatore.generaNumeriCasuali();

        System.out.println("Numeri casuali generati:");
        for (int numero : numeriCasuali) {
            System.out.println(numero);
        }

    }
}
