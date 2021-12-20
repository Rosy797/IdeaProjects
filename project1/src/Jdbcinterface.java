import java.sql.ResultSet;
import java.sql.Connection;

public interface Jdbcinterface {
    public Connection connectMySql();
    public void insert();
    public ResultSet getInfo();

}
