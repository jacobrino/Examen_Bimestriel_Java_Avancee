
import java.util.ArrayList;

import DAO.ClientDAO;
import DAO.TicketDAO;
import MLO.Client;
import MLO.Connexion;
import MLO.Ticket;

public class Main {
    public static void main(String[] args) 
    {
        
        // Toutes les classes du modèle logique object finish sur le commit [ develop b9d9456 ]
        // La classe Connexion est initié et testé avec succes avec la base de donnée 'test_java_avance' sur le commit [ develop 6395174 ]
        // Création de chaque table mysql de chaque class 
        // Normallement, on doit d'abord convetir en MLD la base de donnée pour faciliter la liaison avec la base de donnée.

            // CREATE TABLE Client ( idc INT AUTO_INCREMENT PRIMARY KEY, nomc VARCHAR(255) NOT NULL ); 
            // CREATE TABLE Ticket ( idt INT AUTO_INCREMENT PRIMARY KEY, datet DATE NOT NULL, heuret TIME NOT NULL, idc INT, FOREIGN KEY (idc) REFERENCES Client(idc) ON DELETE CASCADE ON UPDATE CASCADE); 
            // CREATE TABLE Fournisseur ( idf INT AUTO_INCREMENT PRIMARY KEY, nomf VARCHAR(255) NOT NULL ); 
            // CREATE TABLE Produit ( idp INT AUTO_INCREMENT PRIMARY KEY, designation VARCHAR(255) NOT NULL, prix DOUBLE NOT NULL CHECK (prix >= 0), quantiteStock INT NOT NULL CHECK (quantiteStock >= 0), idf INT, FOREIGN KEY (idf) REFERENCES Fournisseur(idf) ON DELETE CASCADE ON UPDATE CASCADE ); 
            // CREATE TABLE Commande ( idcom INT AUTO_INCREMENT PRIMARY KEY, quantite INT NOT NULL CHECK (quantite > 0), estlivre BOOLEAN NOT NULL, idt INT, idp INT, FOREIGN KEY (idt) REFERENCES Ticket(idt) ON UPDATE CASCADE, FOREIGN KEY (idp) REFERENCES Produit(idp) ON UPDATE CASCADE ); 
        
        // Creation ClientDAO class and testé avec succès toutes le CRUD sur le commit [ develop 927cd82 ]
        // Restructuer toutes les dossiers en creant DAO(contenant tous les classes DAO) et aussi MLO(Contenant tous les classes Modèle Logique Objet) et retester les codes, ça fonctionne avec succès  sur le commit [ develop 8116f7d ]
        
        System.out.println("Bonjour java\n\n");

        // DAO<Prof> profdao = new ProfDAO(Connexion.getInstance());
        // DAO<Matiere> matieredao = new MatiereDAO(Connexion.getInstance());
        
        
        // ClientDAO clientDAO = new ClientDAO(Connexion.getInstance());
        TicketDAO ticketDao=new TicketDAO(Connexion.getInstance());
        // Test sélection
        ArrayList<Ticket> tickets = ticketDao.selection();
        for (Ticket c : tickets) 
        {
            System.out.println("Ticket ID: " + c.getIdt() );



        }
        
            
         
        
        
        System.out.println("java finish\n\n");

        


    }

    /*

        Pour compiler et lancer on doit faire la procédure suivante, sinon, ça ne marche pas, car le package mysql-connector n'est pas 
        dans le classpath de notre java(jre, jdk).
        Dans le cas contraire, il faut utiliser un gestionnaire de dépendance (gradle, maven)

        ------------------------------------------------------------------------------------------------------------------------------
        javac -cp ".:mysql-connector-j-9.2.0.jar" Main.java 

        java -cp ".:mysql-connector-j-9.2.0.jar" Main 

        Il faut que le fichier mysql-connector-j-9.2.0.jar se trouve dans le même espace de travail que ce fichier

    */
}
