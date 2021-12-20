import java.sql.SQLException;
import java.util.*;

 public class Gmailip implements  Gmail {
     @Override
     public void inbox() {
         Scanner sc=new Scanner(System.in);
     }

     public void compose()
    {
Scanner sc=new Scanner(System.in);
        System.out.println("from emailid");
        String from=sc.next();
        System.out.println("to emailid ");
        String to=sc.next();
        System.out.println("message to user");
        String message=sc.next();
        Jdbcconnection  con = new Jdbcconnection();
    }
}
