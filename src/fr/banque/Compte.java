package fr.banque;

public class Compte {
    private int num;
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
        return getClass().getName() + " num = " + num + ", solde = " + solde;
    }

    public void retirer(double unMontant) {
        this.solde -= unMontant;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
