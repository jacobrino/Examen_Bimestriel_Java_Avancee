public class Commande 
{
    private int idcom;
    private int quantite;
    private boolean estlivre;
    
    public Commande() 
    {
        this.idcom = 0;
        this.quantite = 0;
        this.estlivre = false;
        // Par défaut, on met estlivre à false, car la commande est par défaut non livré dans notre logique.
    }
    public Commande(int idcom, int quantite, boolean estlivre) 
    {
        this.idcom = idcom;
        this.quantite = quantite;
        this.estlivre = estlivre;
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
}
