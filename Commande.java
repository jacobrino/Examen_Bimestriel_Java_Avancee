public class Commande 
{
    private int idcom;
    private int quantite;
    private boolean estlivre;
    private int idt;
    private int idp;
    
    public Commande() 
    {
        this.idcom = 0;
        this.quantite = 0;
        this.estlivre = false;
        // Par défaut, on met estlivre à false, car la commande est par défaut non livré dans notre logique.
        this.idt=0;
        this.idp=0;
    }
    public Commande(int idcom, int quantite, boolean estlivre, int idt, int idp) 
    {
        this.idcom = idcom;
        this.quantite = quantite;
        this.estlivre = estlivre;
        this.idt=idt;
        this.idp=idp;
    }
    public int getIdcom() 
    {
        return this.idcom;
    }
    public int getQuantite() 
    {
        return this.quantite;
    }
    public boolean getEstlivre() 
    {
        return this.estlivre;
    }
    public int getIdt()
    {
        return this.idt;
    }
    public int getIdp()
    {
        return this.idp;
    }

    public void setIdcom(int idcom) 
    {
        this.idcom = idcom;
    }
    public void setQuantite(int quantite) 
    {
        this.quantite = quantite;
    }
    public void setEstlivre(boolean estlivre) 
    {
        this.estlivre = estlivre;
    }
    public void setIdt(int idt)
    {
        this.idt=idt;
    }
    public void setIdp(int idp)
    {
        this.idp=idp;
    }
}
