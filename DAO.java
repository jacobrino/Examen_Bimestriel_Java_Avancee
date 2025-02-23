import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO<T> 
{
    protected Connection cx = null;
    public DAO(Connection cx) 
    {
        this.cx = cx;
    }

    public abstract boolean insertion(T table);
    public abstract boolean miseAJour(T table);
    public abstract boolean suppression(T table);
    public abstract ArrayList<T> selection();

}