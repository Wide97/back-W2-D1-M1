package ESERCIZIO2;

public class CalcolatoreConsumo {
    public double calcolaConsumo (double chilometri, double litri) {
        if (litri == 0) {
            throw new IllegalArgumentException("I litri non possono essere 0");
        }
        return chilometri / litri;
    }
}
