package DAO;
import java.sql.*;
import java.util.ArrayList;

import MLO.Produit;
import MLO.Commande;
import MLO.DAO;

public class ProduitDAO extends DAO<Produit> 
{
    public ProduitDAO(Connection cx) 
    {
        super(cx);
    }
    
    public boolean insertion(Produit produit) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("INSERT INTO Produit VALUES(null, ?, ?, ?, ?)");
            ps.setString(1, produit.getDesignation());
            ps.setDouble(2, produit.getPrix());
            ps.setInt(3, produit.getQuantiteStock());
            ps.setInt(4, produit.getIdf());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean miseAJour(Produit produit) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("UPDATE Produit SET designation = ?, prix = ?, quantiteStock = ?, idf = ? WHERE idp = ?");
            ps.setString(1, produit.getDesignation());
            ps.setDouble(2, produit.getPrix());
            ps.setInt(3, produit.getQuantiteStock());
            ps.setInt(4, produit.getIdf());
            ps.setInt(5, produit.getIdp());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean suppression(Produit produit) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("DELETE FROM Produit WHERE idp = ?");
            ps.setInt(1, produit.getIdp());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Produit> selection() 
    {
        try 
        {
            ArrayList<Produit> liste = new ArrayList<>();
            ArrayList<Commande> tempCommande = new ArrayList<>();
            
            PreparedStatement ps = this.cx.prepareStatement("SELECT * FROM Produit");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
                Produit p = new Produit(rs.getInt("idp"),
                rs.getString("designation"),
                rs.getDouble("prix"),
                rs.getInt("quantiteStock"),
                rs.getInt("idf"),
                new ArrayList<>());
                liste.add(p);
            }
            
            ps = this.cx.prepareStatement("SELECT * FROM Commande");
            rs = ps.executeQuery();
            // Pour simplifier, on affecte la même liste temporaire à chaque produit
            for (Produit p : liste) 
            {
                p.setCommandes(tempCommande);
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
