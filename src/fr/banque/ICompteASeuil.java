package fr.banque;

public interface ICompteASeuil extends ICompte {
    public default void retirer(double uneValeur) {
        if (getSolde() - uneValeur >= getSeuil()) {
           setSolde(getSolde()-uneValeur);
        } else {
            System.out.println("Retrait impossible");
        }

    }

    public double getSeuil();

    public void setSeuil(double unSeuil);
}