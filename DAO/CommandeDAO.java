package DAO;
import java.sql.*;
import java.util.ArrayList;

import MLO.Commande;

public class CommandeDAO extends DAO<Commande> 
{
    public CommandeDAO(Connection cx) 
    {
        super(cx);
    }
    
    public boolean insertion(Commande commande) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("INSERT INTO Commande VALUES(null, ?, ?, ?, ?)");
            ps.setInt(1, commande.getQuantite());
            ps.setBoolean(2, commande.getEstlivre());
            ps.setInt(3, commande.getIdt());
            ps.setInt(4, commande.getIdp());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean miseAJour(Commande commande) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("UPDATE Commande SET quantite = ?, estlivre = ?, idt = ?, idp = ? WHERE idcom = ?");
            ps.setInt(1, commande.getQuantite());
            ps.setBoolean(2, commande.getEstlivre());
            ps.setInt(3, commande.getIdt());
            ps.setInt(4, commande.getIdp());
            ps.setInt(5, commande.getIdcom());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean suppression(Commande commande) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("DELETE FROM Commande WHERE idcom = ?");
            ps.setInt(1, commande.getIdcom());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Commande> selection() 
    {
        try 
        {
            ArrayList<Commande> liste = new ArrayList<>();
            PreparedStatement ps = this.cx.prepareStatement("SELECT * FROM Commande");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
                Commande c = new Commande(rs.getInt("idcom"),
                rs.getInt("quantite"),
                rs.getBoolean("estlivre"),
                rs.getInt("idt"),
                rs.getInt("idp"));
                liste.add(c);
            }
            return liste;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return null;
        }
    }
}
