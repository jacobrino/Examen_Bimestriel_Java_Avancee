import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion 
{
    private String url = "jdbc:mysql://127.0.0.1/test_java_avance";
    private String utilisateur = "phpmyadmin";
    private String passe = "0000";
    // Le mot de passe est juste pour test, mais normallement en terme de sécurité, on ne met pas de mot de passe aussi simple que ça.

    private static Connection cx=null;
    
    private Connexion() 
    {
        try 
        {
            Connexion.cx = DriverManager.getConnection(url, utilisateur, passe);
        } 
        catch(SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public static Connection getInstance() 
    {
        if(cx == null) 
        {
            new Connexion();
        }
        return cx;
    }
}