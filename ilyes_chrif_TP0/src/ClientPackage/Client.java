package ClientPackage;

import java.io.OutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[]args)
    {
        try {
            System.out.println("Je suis un client pas encore connecté...");

            // Crée un socket client et se connecte au serveur sur le port 1234
            Socket sk = new Socket("192.168.56.1", 1234);
            System.out.println("je suis un client connecté");


            // Ferme le socket client
            sk.close();
            System.out.println("je suis un client déconnecté");
        }
        catch (Exception e)
        {
            // Gestion de l'exception qui affiche un message d'erreur
            System.out.println("Erreur de connexion au serveur : " + e.getMessage()); //on peut utiliser e.printStackTrace();

        }


    }

}
