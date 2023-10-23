package fr.banque;

public class Compte {
    private int num;
    private double solde;

    public Compte(int num, double solde) {
        this.num = num;
        this.solde = solde;
    }


    @Override
    public String toString() {
        return "Compte [num=" + num + ", solde=" + solde + "]";
    }

    public void ajouter(double unMontant) {
        this.solde += unMontant;
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
