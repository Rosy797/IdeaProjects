import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;

import static java.lang.Class.forName;


public class firstjdbc {
    static String url = "jdbc:mysql://localhost:3306/BookApi";
    static String userName = "root";
    static String pass = "Panipat@123";


    public static void main(String args[]) {

        Connection con = null;
        Statement stm = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
               // con =getConnection(url, userName, pass);
               // if (con != null) {
                 //   System.out.println("jdbc connected");
               // }
               // stm = con.createStatement();
               // String sql = "INSERT INTO book VALUES ('123a','aa','bb','cc','21sep')";
               // stm.executeUpdate(sql);
               // System.out.println(sql);

              //  System.out.println("Details Added.");
            //} catch (ClassNotFoundException e) {

          //  }
      //  }
   // }

            con= DriverManager.getConnection(url,userName,pass);
            if(con!=null) {
                System.out.println("jdbc connected");
            }

            stm = con.createStatement();
            String sql = "INSERT INTO book VALUES ('123a','aa','bb','cc','21sep')";
            stm.executeUpdate(sql);
            System.out.println(sql);

            System.out.println("Details Added.");


            //String sql1 = "select * from book";
            // ResultSet rs = stm.executeQuery(sql1);
            // while (rs.next()) {

            //System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
        } catch (SQLException | ClassNotFoundException e) {
        }

    }
}