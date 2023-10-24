package fr.banque;

public class CompteRemunere extends Compte {
    private final double taux;

    public CompteRemunere(int num, double solde,double taux) {
        super(num, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + ", taux=" + taux;
    }

    public double calculerInterets() {
        return taux * getSolde();
    }

    public void verserInterets() {
        double interets = calculerInterets();
        super.verser(interets);
    }

    public double getTaux() {
        return taux;
    }

}