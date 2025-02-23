import java.time.LocalTime;
import java.util.ArrayList;
import java.time.LocalDate;

public class Ticket 
{
    private int idt;
    private LocalDate datet;
    private LocalTime heuret;
    private int idc;
    private ArrayList<Commande> commandes;

    public Ticket() 
    {
        this.idt = 0;
        this.datet = null;
        // Par défaut, on initialise à null
        this.heuret = null;
        // Par défaut, on initialise à null
        this.idc=0;
        this.commandes=null;
    }
    public Ticket(int idt, LocalDate datet, LocalTime heuret, int idc, ArrayList<Commande> commandes) 
    {
        this.idt = idt;
        this.datet = datet;
        this.heuret = heuret;
        this.idc=idc;
        this.commandes=commandes;
    }
    public int getIdt() 
    {
        return this.idt;
    }
    public LocalDate getDatet() 
    {
        return this.datet;
    }
    public LocalTime getHeuret() 
    {
        return this.heuret;
    }
    public int getIdc()
    {
        return this.idc;
    }
    public ArrayList<Commande> getCommandes()
    {
        return this.commandes;
    }

    public void setIdt(int idt) 
    {
        this.idt = idt;
    }
    public void setDatet(LocalDate datet) 
    {
        this.datet = datet;
    }
    public void setDatet(int year, int month, int day) 
    {
        this.datet = LocalDate.of(year, month, day);
    }
    // Cette méthode sert directement à passer comme paramètres year, month, day
    
    public void setHeuret(LocalTime heuret) 
    {
        this.heuret = heuret;
    }
    public void setHeuret(int hour, int minute, int second) 
    {
        this.heuret = LocalTime.of(hour,minute,second);
    }
    // Cette méthode sert directement à passer comme paramètres hour, minute, second 

    public void setIdc(int idc)
    {
        this.idc=idc;
    }
    public void setCommandes(ArrayList<Commande> commandes)
    {
        this.commandes=commandes;
    }
}
