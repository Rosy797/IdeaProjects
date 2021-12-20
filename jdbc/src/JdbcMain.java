
import java.sql.*;
import java.util.Scanner;

public class JdbcMain {

    static String url="jdbc:mysql://localhost:3306/demo";
    static String userName="root";
    static String pass="vtiger";
    static Connection con=null;
    static Statement stm=null;


    public static void main(String args[]) throws Exception{
        /
    }
    public static void option() throws Exception{
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1:inbox");
            System.out.println("2:sent");
            System.out.println("3:compose");
            System.out.println("4:exit");
            System.out.println("enter the option");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    inbox();
                    break;
                case 2:
                    sent();
                    break;
                case 3:
                    compose();
                    break;
                case 4: return;

            }
        }



        //
        //input from user
        //name,usn,age,branch
        //data base by jdbc
        //data create table
        //10 student details
        //funtions
        //main have option to select user can give the input,serch,delete
        //input ->nuber of student
        //second function search->you need to serch based on usn
        //delete function which is able to delete the record based on usn





    }
    public static void inbox() throws Exception{
        Scanner sc = new Scanner(System.in);
        int number;

        String name;
        String lastname;
        String email;

        System.out.println("enter the information");
        number=sc.nextInt();
        for(int i=0;i<number;i++){

            System.out.println("enter name");
            name=sc.next();
            System.out.println("enter lastname");
            lastname=sc.next();
            System.out.println("enter email");
            email=sc.next();
            stm= con.createStatement(sql);
            sql="INSERT INTO student VALUES(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(sql);

            stmt.setString(1,name);
            stmt.setInt(2,lastname);
            stmt.setString(3,email);
            System.out.println(sql);
            stmt.executeUpdate();
        }

    }
    public static void search() throws Exception{
        String usn;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter usn of student");
        usn=sc.next();
        stm=con.createStatement();
        String sql="select * from student where usn='"+usn+"'";
        ResultSet rs= stm.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getInt(3)+","+rs.getString(4));
        }
    }
    public static void delete() throws Exception{
        String usn;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter usn of student");
        usn=sc.next();
        stm=con.createStatement();
        String sql="delete from student where usn='"+usn+"'";
        stm.executeUpdate(sql);

    }

    public static void dataConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,userName,pass);
            if(con!=null) {
                System.out.println("jdbc connected");
            }
        }
        catch (Exception e) {
            System.out.println(e);

        }

    }
}
