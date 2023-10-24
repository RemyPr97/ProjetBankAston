package fr.banque;

public class CompteASeuil extends Compte {
    private double seuil;

    public CompteASeuil(int num, double solde, double seuil) {
        super(num, solde);
        this.seuil = seuil;
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void retirer(double uneValeur) {
        if (getSolde() - uneValeur >= seuil) {
            super.retirer(uneValeur);
        } else {
            System.out.println("Retrait impossible");
        }
    }


}
