import java.sql.*;
import java.util.ArrayList;

public class ClientDAO extends DAO<Client> 
{
    public ClientDAO(Connection cx) 
    {
        super(cx);
    }
    
    public boolean insertion(Client client) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("INSERT INTO Client VALUES(null, ?)");
            ps.setString(1, client.getNomc());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean miseAJour(Client client) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("UPDATE Client SET nomc = ? WHERE idc = ?");
            ps.setString(1, client.getNomc());
            ps.setInt(2, client.getIdc());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean suppression(Client client) 
    {
        try 
        {
            PreparedStatement ps = this.cx.prepareStatement("DELETE FROM Client WHERE idc = ?");
            ps.setInt(1, client.getIdc());
            ps.executeUpdate();
            return true;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Client> selection() 
    {
        try 
        {
            ArrayList<Client> liste = new ArrayList<>();
            PreparedStatement ps = this.cx.prepareStatement("SELECT * FROM Client");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                Client c = new Client(rs.getInt("idc"), rs.getString("nomc"), new ArrayList<>());
                liste.add(c);
            }
            
            ps = this.cx.prepareStatement("SELECT * FROM ticket");
            rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                for (Client c : liste) 
                {
                    if (c.getIdc() == rs.getInt("idc")) 
                    {
                        // Ticket t = new Ticket(rs.getInt("idt"), rs.getString("details"), rs.getInt("idc"));
                        // c.getTickets().add(t);
                    }
                }
            }
            
            return liste;
        } catch (SQLException e) 
        {
            e.printStackTrace();
            return null;
        }
    }
}
