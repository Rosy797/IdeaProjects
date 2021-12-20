
import java.sql.*;
public class Main {
    static String url = "jdbc:mysql://localhost:3306/demo";
    static String userName = "root";
    static String pass = "Panipat@123";
    static Connection con = null;
    static Statement stm = null;




    public static void main(String args[]) {


        try {

            con = DriverManager.getConnection(url, userName, pass);
            System.out.println("connected");
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
