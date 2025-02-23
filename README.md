*Examen Bimestriel Java Avancé

*Ce projet a pour objectif la liaison d'une base de données relationnelle avec le langage de programmation Java en utilisant le package mysql-connector.
Historique des commits

    Modèle logique objet : Toutes les classes du modèle logique objet ont été finalisées sur le commit "develop b9d9456".

    Connexion à la base de données : La classe "Connexion" a été initialisée et testée avec succès avec la base de données "test_java_avance" sur le commit "develop 6395174".

    Création des tables MySQL : Pour chaque classe, une table MySQL a été créée. Normalement, il faut d'abord convertir la base de données en MLD pour faciliter la liaison avec la base de données.

*Schéma de la base de données

    CREATE TABLE Client ( idc INT AUTO_INCREMENT PRIMARY KEY, nomc VARCHAR(255) NOT NULL );

    CREATE TABLE Ticket ( idt INT AUTO_INCREMENT PRIMARY KEY, datet DATE NOT NULL, heuret TIME NOT NULL, idc INT, FOREIGN KEY (idc) REFERENCES Client(idc) ON DELETE CASCADE ON UPDATE CASCADE );

    CREATE TABLE Fournisseur ( idf INT AUTO_INCREMENT PRIMARY KEY, nomf VARCHAR(255) NOT NULL );

    CREATE TABLE Produit ( idp INT AUTO_INCREMENT PRIMARY KEY, designation VARCHAR(255) NOT NULL, prix DOUBLE NOT NULL CHECK (prix >= 0), quantiteStock INT NOT NULL CHECK (quantiteStock >= 0), idf INT, FOREIGN KEY (idf) REFERENCES Fournisseur(idf) ON DELETE CASCADE ON UPDATE CASCADE );

    CREATE TABLE Commande ( idcom INT AUTO_INCREMENT PRIMARY KEY, quantite INT NOT NULL CHECK (quantite > 0), estlivre BOOLEAN NOT NULL, idt INT, idp INT, FOREIGN KEY (idt) REFERENCES Ticket(idt) ON UPDATE CASCADE, FOREIGN KEY (idp) REFERENCES Produit(idp) ON UPDATE CASCADE );

*DAO et Modèle Logique Objet

    ClientDAO : La classe "ClientDAO" a été créée et toutes les opérations CRUD ont été testées avec succès sur le commit "develop 927cd82".

    Restructuration des dossiers :
        Les dossiers ont été restructurés en créant un dossier "DAO" contenant toutes les classes DAO et un dossier "MLO" contenant toutes les classes du Modèle Logique Objet.
        Ces modifications ont été testées et fonctionnent avec succès sur le commit "develop 8116f7d".
        Une nouvelle restructuration a été réalisée sur le commit "develop f438c82".

*Compilation et exécution

    Pour compiler et exécuter le projet, il est impératif de suivre la procédure suivante, car le package mysql-connector n'est pas présent dans le classpath par défaut (JRE, JDK). Vous pouvez également utiliser un gestionnaire de dépendances (Gradle, Maven).

    Commandes à utiliser :

        Compilation : javac -cp ".:mysql-connector-j-9.2.0.jar" Main.java

        Exécution : java -cp ".:mysql-connector-j-9.2.0.jar" Main

    Note : Le fichier "mysql-connector-j-9.2.0.jar" doit se trouver dans le même répertoire que le fichier "Main.java".