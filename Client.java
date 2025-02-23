public class Client 
{
    private int idc;
    private String nomc;
    
    public Client() 
    {
        this.idc = 0;
        this.nomc = "";
    }
    public Client(int idc, String nomc) 
    {
        this.idc = idc;
        this.nomc = nomc;
    }
    public int getIdc() 
    {
        return this.idc;
    }
    public String getNomc() 
    {
        return this.nomc;
    }

    public void setIdc(int idc) 
    {
        this.idc = idc;
    }
    public void setNomc(String nomc) 
    {
        this.nomc = nomc;
    }

}
