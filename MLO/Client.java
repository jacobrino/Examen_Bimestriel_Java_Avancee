package MLO;
import java.util.ArrayList;

public class Client 
{
    private int idc;
    private String nomc;
    private ArrayList<Ticket> tickets;

    public Client() 
    {
        this.idc = 0;
        this.nomc = "";
        this.tickets=null;
    }
    public Client(int idc, String nomc, ArrayList<Ticket> tickets) 
    {
        this.idc = idc;
        this.nomc = nomc;
        this.tickets=tickets;
    }
    public int getIdc() 
    {
        return this.idc;
    }
    public String getNomc() 
    {
        return this.nomc;
    }
    public ArrayList<Ticket> getTickets()
    {
        return this.tickets;
    }

    public void setIdc(int idc) 
    {
        this.idc = idc;
    }
    public void setNomc(String nomc) 
    {
        this.nomc = nomc;
    }
    public void setTickets(ArrayList<Ticket> tickets)
    {
        this.tickets=tickets;
    }
}
