import fr.banque.Client;
import fr.banque.Compte;

public class Run {
    public static void main(String[] args) {
        Client client = new Client();
        client.setNom("Doe");
        client.setPrenom("John");
        client.setAge(42);
        client.setNum(123456);
        System.out.println(client);

        Client client2 = new Client("Doe", "Jane", 42, 123456, null);
        System.out.println(client2);

        Client client3 = new Client("Doe", "Jane", 42, 123456, new Compte[0]);
        System.out.println(client3);

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(1, 100.0);
        comptes[1] = new Compte(2, 200.0);
        Client client4 = new Client("Doe", "Jane", 42, 123456, comptes);
        System.out.println(client4);

        client4.getComptes()[0].ajouter(100.0);
        System.out.println(client4);

        client4.getComptes()[0].retirer(50.0);
        System.out.println(client4);

        client4.getComptes()[1].ajouter(100.0);
        System.out.println(client4);

        client4.getComptes()[1].retirer(50.0);
        System.out.println(client4);

        client4.getComptes()[1].retirer(500.0);
        System.out.println(client4);

        client4.getComptes()[1].ajouter(500.0);
        System.out.println(client4);


    }
}