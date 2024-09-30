
package ESERCIZIO2;

public class CalcolatoreConsumo2 {

    public int calcolaConsumo(int chilometri, int litri) {
        if (litri == 0) {
            throw new IllegalArgumentException("I litri consumati non possono essere zero.");
        }
        return chilometri / litri;
    }
}
