import fr.banque.Client;
import fr.banque.Compte;
import fr.banque.CompteASeuil;
import fr.banque.CompteRemunere;

public class Run {
    public static void main(String[] args) {
        var c1 = new Compte(1, 1000);
        var c2 = new CompteRemunere(2, 2000, 0.2);
        var c3 = new CompteASeuil(3, 3000, 500);
        var c4 = new Compte(4, 1000);
        var c5 = new CompteRemunere(5, 2000, 0.2);
        var c6 = new CompteASeuil(6, 3000, 500);

        Client client1 = new Client();
        client1.ajouterCompte(c1);
        client1.ajouterCompte(c2);
        client1.ajouterCompte(c3);
        client1.ajouterCompte(c4);
        client1.ajouterCompte(c5);
        client1.ajouterCompte(c6);
    }
}
