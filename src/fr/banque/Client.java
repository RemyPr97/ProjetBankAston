package fr.banque;


public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int num;
    private Compte[] comptes = new Compte[5];

    public Client() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client : Nom = ").append(nom).append(", prenom = ").append(prenom).append(", age = ").append(age).append(", num = ").append(num).append(", comptes =[");

        if (comptes != null && comptes.length > 0) {
            for (int i = 0; i < comptes.length; i++) {
                sb.append(comptes[i]);
                if (i < comptes.length - 1) {
                    sb.append(", ");
                }
            }
        }

        sb.append("]]");
        return sb.toString();
    }


    public void ajouterCompte(Compte unCompte) {

        for (int i = 0; i < comptes.length; i++) {
            if (comptes[comptes.length-1] != null) {
                System.err.println("Le nombre maximun de compte est atteint");
                break;
            } else {

                if (comptes[i] == null) {
                    comptes[i] = unCompte;
                    System.out.println(unCompte + "  est bien ajouter");
                    break;
                }
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public int getNum() {
        return num;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }
}
