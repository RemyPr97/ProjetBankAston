package fr.banque;

public class Compte {
    private final int num;
    private double solde;

    public Compte(int num, double solde) {
        this.num = num;
        this.solde = solde;
    }


    @Override
    public String toString() {
        return "Compte num=" + num + ", solde=" + solde;
    }

    public void retirer(double unMontant) {
        this.solde -= unMontant;
    }

    public int getNum() {
        return num;
    }

    public double getSolde() {
        return solde;
    }

}
