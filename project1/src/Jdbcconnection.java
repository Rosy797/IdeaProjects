import java.sql.*;

public class Jdbcconnection implements Jdbcinterface {
    String url = "jdbc:mysql://localhost:3306/email";
    String userName = "root";
    String pass = "Panipat@123";
     Connection con = null;
    PreparedStatement stm = null;

public Connection connectMysql() throws ClassNotFoundException, SQLException
{
        Class.forName("com.Mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,userName,pass);
        return null;
    }
    public void insert(String from,String to, String message)throws SQLException {
        String sql = "insert into email(from,to,message)values(?,?,?)";
        stm = con.prepareStatement(sql);
        stm.setString(0, from);
        stm.setString(1, to);
        stm.setString(2, message);
        stm.executeUpdate();
        stm.close();
    }
    public ResultSet getInfo(String emailId,String mode)throws SQLException{
    if(mode=="inbox");
        {
            Statement stm2= con.createStatement();
            String sql="select * from = email where to='"+emailId+"'";
            ResultSet rs=stm2.executeQuery(sql);
            stm2.close();
            return rs;
        }
           else if(mode=="sent"){
               Statement stm2=con.createStatement();
               String sql="select * from email where from='"+emailId+"'";
               ResultSet rs= stm2.executeQuery(sql);
               stm2.close();
               return rs;

        }
           return null;
    }

}