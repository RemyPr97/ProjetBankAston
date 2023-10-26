package fr.banque;

public interface ICompteRemunere extends ICompte {
    public void setTaux(double unTaux);
    public double getTaux();

    public double calculerInterets();
    public void verserInterets();


}
