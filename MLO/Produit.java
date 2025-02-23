package MLO;
import java.util.ArrayList;

public class Produit 
{
    private int idp;
    private String designation;
    private double prix;
    // On a mis la variable prix en double car un prix peut avoir une virgule. Comme 200,95 ariary
    private int quantiteStock;
    private int idf;
    private ArrayList<Commande> commandes;

    public Produit() 
    {
        this.idp = 0;
        this.designation = "";
        this.prix = 0.0;
        this.quantiteStock=0;
        this.idf=0;
        this.commandes=null;
    }
    public Produit(int idp, String designation, double prix, int quantiteStock, int idf, ArrayList<Commande> commandes) 
    {
        this.idp = idp;
        this.designation = designation;
        this.prix = prix;
        this.quantiteStock=quantiteStock;
        this.idf=idf;
        this.commandes=commandes;

    }
    public int getIdp() 
    {
        return this.idp;
    }
    public String getDesignation() 
    {
        return this.designation;
    }
    public double getPrix()
    {
        return this.prix;
    }
    public int getQuantiteStock()
    {
        return this.quantiteStock;
    }
    public int getIdf()
    {
        return this.idf;
    }
    public ArrayList<Commande> getCommandes()
    {
        return this.commandes;
    }
    
    public void setIdp(int idp) 
    {
        this.idp = idp;
    }
    public void setDesignation(String designation) 
    {
        this.designation = designation;
    }
    public void setPrix(double prix)
    {
        this.prix=prix;
    }
    public void setQuantiteStock(int quantiteStock)
    {
        this.quantiteStock=quantiteStock;
    }
    public void setIdf(int idf)
    {
        this.idf=idf;
    }
    public void setCommandes(ArrayList<Commande> commandes)
    {
        this.commandes=commandes;
    }
    
}
