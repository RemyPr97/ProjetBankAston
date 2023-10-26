import fr.banque.*;

public class Run {
    public static void main(String[] args) {
        var c1 = new Compte(1, 1000);
        var c2 = new CompteRemunere(2, 2000, 0.2);
        var c3 = new CompteASeuil(3, 3000, 500);
        var c4 = new CompteASeuilRemunere(4, 1000, 0.4, 250);
        var c5 = new CompteRemunere(5, 2000, 0.2);
        var c6 = new CompteASeuil(6, 3000, 500);

        var client1 = new Client("Doe", "John", 35, 1);

        try {
            client1.ajouterCompte(c1);
            client1.ajouterCompte(c2);
            client1.ajouterCompte(c3);
            client1.ajouterCompte(c4);
            client1.ajouterCompte(c5);
            client1.ajouterCompte(c6);
        } catch (BanqueException e) {
            System.err.println(e.getMessage());
        }

        c2.verserInterets();
        c5.verserInterets();


    }

}
