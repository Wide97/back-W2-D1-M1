package ESERCIZIO1;

import java.util.Random;

public class GeneratoreNumeri {
    public int[] generaNumeriCasuali() {
        int[] numeriCasuali = new int[5];
        Random random = new Random();
        for (int i=0; i < numeriCasuali.length; i ++) {
            numeriCasuali[i] = random.nextInt(10) + 1;
        }
        return  numeriCasuali;
    }

}
