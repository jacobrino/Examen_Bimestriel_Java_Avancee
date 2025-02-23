import java.time.LocalTime;
import java.time.LocalDate;

public class Ticket 
{
    private int idt;
    private LocalDate datet;
    private LocalTime heuret;
    
    public Ticket() 
    {
        this.idt = 0;
        this.datet = null;
        // Par défaut, on initialise à null
        this.heuret = null;
        // Par défaut, on initialise à null
    }
    public Ticket(int idt, LocalDate datet, LocalTime heuret) 
    {
        this.idt = idt;
        this.datet = datet;
        this.heuret = heuret;
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
}
