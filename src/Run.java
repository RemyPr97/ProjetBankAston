import fr.banque.Client;
import fr.banque.Compte;
import fr.banque.CompteASeuil;
import fr.banque.CompteRemunere;

public class Run {

    public static void main(String[] args) {
        Compte c1 = new Compte(1, 1000);
        Compte c2 = new Compte(2, 2000);
        Compte c3 = new Compte(3, 3000);
        Compte[] comptesForClient1 = {c1, c2, c3};

        Client client1 = new Client("Dupont", "Jean", 25, 1, comptesForClient1);
        System.out.println(client1);

        CompteASeuil c4 = new CompteASeuil(4, 4000, 100);
        CompteRemunere c5 = new CompteRemunere(5, 5000, 0.1);
        Compte[] comptesForClient2 = {c4, c5};

        Client client2 = new Client("Durand", "Marie", 30, 2, comptesForClient2);
        System.out.println(client2);

        client2.ajouterCompte(new Compte(6, 6000));
        System.out.println(client2);

        client2.ajouterCompte(new CompteRemunere(7, 7000, 0.2));
        System.out.println(client2);

        client2.ajouterCompte(new CompteASeuil(8, 8000, 200));
        System.out.println(client2);
    }
}
