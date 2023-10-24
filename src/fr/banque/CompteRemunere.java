package fr.banque;

public class CompteRemunere extends Compte {
    private double taux;

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public CompteRemunere(int num, double solde, double taux) {
        super(num, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double calculerInterets() {
        return taux * getSolde();
    }

}