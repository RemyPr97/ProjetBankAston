package fr.banque;

public interface ICompte {
    public int getNum();

    public void setNum(int num);

    public double getSolde();

    public void setSolde(double solde);



    public void retirer(double uneValeur);
}
