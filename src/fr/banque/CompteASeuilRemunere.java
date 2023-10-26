package fr.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil {

    private  double seuil;

    public CompteASeuilRemunere(int num, double solde, double taux, double seuil) {
        super(num, solde, taux);
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return super.toString()+" seuil = "+seuil;
    }

    public void retirer(double uneValeur) {
        if (getSolde() - uneValeur >= seuil) {
            super.retirer(uneValeur);
        } else {
            System.out.println("Retrait impossible");
        }
    }

    @Override
    public double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

}
