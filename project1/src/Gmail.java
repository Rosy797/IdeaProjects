import java.sql.SQLException;


public interface Gmail{
    public void inbox()throws SQLException,ClassNotFoundException;
    public void sent()throws SQLException,ClassNotFoundException;
    public void compose()throws SQLException,ClassNotFoundException;
}
