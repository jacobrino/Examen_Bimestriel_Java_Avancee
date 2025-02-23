import java.sql.Connection;

public class Main {
    public static void main(String[] args) 
    {
        
        // Toutes les classes du modèle logique object finish sur le commit [ develop b9d9456 ]
        // La classe Connexion est initié et teste avec la base de donnée 'test_java_avance' sur le commit [ develop 6395174 ]
        

        System.out.println("Bonjour java\n\n");

        Connection test=Connexion.getInstance();

        if (test != null) 
        {
            System.out.println("Connexion réussi");
        }
        else
        {
            System.out.println("Connexion non réussi");
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
