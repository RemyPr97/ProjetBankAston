package fr.banque;



public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int num;
    private Compte[] comptes;

    public Client() {
    }

    public Client(String nom, String prenom, int age, int num, Compte[] comptes) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.num = num;
        this.comptes = comptes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client [nom=").append(nom)
                .append(", prenom=").append(prenom)
                .append(", age=").append(age)
                .append(", num=").append(num)
                .append(", comptes=[");

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
        Compte[] newComptes = new Compte[this.comptes.length + 1];
        for (int i = 0; i < this.comptes.length; i++) {
            newComptes[i] = this.comptes[i];
        }
        newComptes[this.comptes.length] = unCompte;
        this.comptes = newComptes;
    }

    public Compte getCompte(int numeroCompte) {
        for (Compte compte : this.comptes) {
            if (compte.getNum() == numeroCompte) {
                return compte;
            }
        }
        return null;
    }

    public void afficher() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Age: " + this.age);
        System.out.println("Num: " + this.num);
        System.out.println("Comptes: ");
        for (Compte compte : this.comptes) {
            System.out.println(compte);
        }
    }

    public void afficher(int numeroCompte) {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Age: " + this.age);
        System.out.println("Num: " + this.num);
        System.out.println("Compte: ");
        System.out.println(this.getCompte(numeroCompte));
    }


    public void afficher(boolean avecComptes) {
        System.out.println("Nom: " + this.nom);
        System.out.println("Prenom: " + this.prenom);
        System.out.println("Age: " + this.age);
        System.out.println("Num: " + this.num);
        if (avecComptes) {
            System.out.println("Comptes: ");
            for (Compte compte : this.comptes) {
                System.out.println(compte);
            }
        }
    }
}
