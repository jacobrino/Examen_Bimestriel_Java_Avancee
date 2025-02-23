public class Produit 
{
    private int idp;
    private String designation;
    private double prix;
    // On a mit la variable prix en double car un prix peut avoir une virgule. Comme 200,95 ariary
    private int quantiteStock;
    public Produit() 
    {
        this.idp = 0;
        this.designation = "";
        this.prix = 0.0;
        this.quantiteStock=0;
    }
    public Produit(int idp, String designation, double prix, int quantiteStock) 
    {
        this.idp = idp;
        this.designation = designation;
        this.prix = prix;
        this.quantiteStock=quantiteStock;
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
    
    
}
