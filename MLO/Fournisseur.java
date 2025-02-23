package MLO;
import java.util.ArrayList;

public class Fournisseur 
{
    private int idf;
    private String nomf;
    private ArrayList<Produit> produits;

    
    public Fournisseur() 
    {
        this.idf = 0;
        this.nomf = "";
        this.produits=null;
    }
    public Fournisseur(int idf, String nomf, ArrayList<Produit> produits) 
    {
        this.idf = idf;
        this.nomf = nomf;
        this.produits=produits;
    }
    public int getIdf() 
    {
        return this.idf;
    }
    public String getNomf() 
    {
        return this.nomf;
    }
    public ArrayList<Produit> getProduits()
    {
        return this.produits;
    }

    public void setIdf(int idf) 
    {
        this.idf = idf;
    }
    public void setNomf(String nomf) 
    {
        this.nomf = nomf;
    }
    public void setProduits(ArrayList<Produit> produits)
    {
        this.produits=produits;
    }

}
