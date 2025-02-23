package DAO;
import java.sql.*;
import java.util.ArrayList;

import MLO.Ticket;
import MLO.Commande;

public class TicketDAO extends DAO<Ticket> 
{
    public TicketDAO(Connection cx) 
    {
        super(cx);
    }
    
    public boolean insertion(Ticket ticket) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("INSERT INTO Ticket VALUES(null, ?, ?, ?)");
            ps.setDate(1, Date.valueOf(ticket.getDatet()));
            ps.setTime(2, Time.valueOf(ticket.getHeuret()));
            ps.setInt(3, ticket.getIdc());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean miseAJour(Ticket ticket) 
    {
        try 
        {            
            PreparedStatement ps = this.cx.prepareStatement("UPDATE Ticket SET datet = ?, heuret = ? WHERE idt = ?");
            ps.setDate(1, Date.valueOf(ticket.getDatet()));
            ps.setTime(2, Time.valueOf(ticket.getHeuret()));
            ps.setInt(3, ticket.getIdt());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean suppression(Ticket ticket) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("DELETE FROM Ticket WHERE idt = ?");
            ps.setInt(1, ticket.getIdt());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Ticket> selection() 
    {
        try 
        {
            ArrayList<Ticket> liste = new ArrayList<>();
            ArrayList<Commande> tempCommande = new ArrayList<>();
            PreparedStatement ps = this.cx.prepareStatement("SELECT * FROM Ticket");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                Ticket t = new Ticket(rs.getInt("idt"), rs.getDate("datet").toLocalDate(), rs.getTime("heuret").toLocalTime(), rs.getInt("idc"), new ArrayList<>());
                liste.add(t);
            }
            
            ps = this.cx.prepareStatement("SELECT * FROM Commande");
            rs = ps.executeQuery();
            
            for (Ticket t : liste) 
            {
                t.setCommandes(tempCommande);
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
