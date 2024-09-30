package ESERCIZIO3;

public class ContoCorrente {

    private String titolare;
    private int nMovimenti;
    private final int maxMovimenti = 50;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
        if (x <= 0) {
            System.out.println("L'importo del prelievo deve essere positivo.");
            return;
        }
        if (x > saldo) {
            System.out.println("Saldo insufficiente per effettuare il prelievo.");
            return;
        }

        if (nMovimenti < maxMovimenti) {
            saldo -= x;
        } else {
            saldo -= (x + 0.50);
        }
        nMovimenti++;
    }

    public void deposita(double x) {
        if (x <= 0) {
            System.out.println("L'importo del deposito deve essere positivo.");
            return;
        }
        saldo += x;
    }

    public double restituisciSaldo() {
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }
}

