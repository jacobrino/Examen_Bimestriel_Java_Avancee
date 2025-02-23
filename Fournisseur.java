public class Fournisseur 
{
    private int idf;
    private String nomf;
    
    public Fournisseur() 
    {
        this.idf = 0;
        this.nomf = "";
    }
    public Fournisseur(int idf, String nomf) 
    {
        this.idf = idf;
        this.nomf = nomf;
    }
    public int getIdf() 
    {
        return this.idf;
    }
    public String getNomf() 
    {
        return this.nomf;
    }

    public void setIdf(int idf) 
    {
        this.idf = idf;
    }
    public void setNomf(String nomf) 
    {
        this.nomf = nomf;
    }

}
