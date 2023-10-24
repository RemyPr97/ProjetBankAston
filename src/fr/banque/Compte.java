package fr.banque;

public class Compte {
    private final int num;
    private double solde;

    public Compte(int num, double solde) {
        this.num = num;
        this.solde = solde;
    }

    public void verser(double unMontant) {
        this.solde += unMontant;
    }


    @Override
    public String toString() {
        return getClass().getName() + " num=" + num + ", solde=" + solde;
    }

    public void retirer(double unMontant) {
        this.solde -= unMontant;
    }

    public double getSolde() {
        return solde;
    }

}
