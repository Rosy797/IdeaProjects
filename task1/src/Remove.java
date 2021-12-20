
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class Remove
{
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String email ;
        email=sc.nextLine();
        if (isValid(email))
            System.out.print("valid");
        else
            System.out.print("not valid");
    }
}
