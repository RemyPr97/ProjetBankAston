package fr.banque;

public class CompteASeuil  extends Compte implements ICompteASeuil {
    private  double seuil;

    public CompteASeuil(int num, double solde, double seuil) {
        super(num, solde);
        this.seuil = seuil;
    }

    @Override
    public double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return super.toString()+" seuil = "+seuil;
    }

    /*public void retirer(double uneValeur) {
        if (getSolde() - uneValeur >= seuil) {
            super.retirer(uneValeur);
        } else {
            System.out.println("Retrait impossible");
        }
    }*/





}
