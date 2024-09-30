package ESERCIZIO3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() +
                "\nSaldo: " + restituisciSaldo() +
                "\nNumero movimenti: " + getnMovimenti() +
                "\nMassimo movimenti: " + getMaxMovimenti() +
                "\nMassimo prelievo possibile: " + maxPrelievo);
    }

    @Override
    public void preleva(double x) {
        if (x > maxPrelievo) {
            System.out.println("Errore: il prelievo supera il massimo consentito di " + maxPrelievo + ".");
            return;
        }
        super.preleva(x);
    }
}

