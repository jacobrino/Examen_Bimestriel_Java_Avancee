package DAO;
import java.sql.*;
import java.util.ArrayList;

import MLO.Fournisseur;
import MLO.Produit;

public class FournisseurDAO extends DAO<Fournisseur> 
{
    public FournisseurDAO(Connection cx) 
    {
        super(cx);
    }
    
    public boolean insertion(Fournisseur fournisseur) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("INSERT INTO Fournisseur VALUES(null, ?)");
            ps.setString(1, fournisseur.getNomf());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean miseAJour(Fournisseur fournisseur) 
    {
        try 
        {            
            PreparedStatement ps = this.cx.prepareStatement("UPDATE Fournisseur SET nomf = ? WHERE idf = ?");
            ps.setString(1, fournisseur.getNomf());
            ps.setInt(2, fournisseur.getIdf());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean suppression(Fournisseur fournisseur) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("DELETE FROM Fournisseur WHERE idf = ?");
            ps.setInt(1, fournisseur.getIdf());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Fournisseur> selection() 
    {
        try 
        {
            ArrayList<Fournisseur> liste = new ArrayList<>();
            ArrayList<Produit> tempProduit = new ArrayList<>();
            PreparedStatement ps = this.cx.prepareStatement("SELECT * FROM Fournisseur");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                Fournisseur f = new Fournisseur(rs.getInt("idf"), rs.getString("nomf"), new ArrayList<>());
                liste.add(f);
            }
            
            ps = this.cx.prepareStatement("SELECT * FROM Produit");
            rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                for (Fournisseur f : liste) 
                {
                    if (f.getIdf() == rs.getInt("idf")) 
                    {
                        Produit p = new Produit(rs.getInt("idp"), rs.getString("designation"), rs.getDouble("prix"), rs.getInt("quantiteStock"), rs.getInt("idf"), null);
                        tempProduit.add(p);
                    }
                }
            }
            
            for (Fournisseur f : liste) 
            {
                f.setProduits(tempProduit);
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
