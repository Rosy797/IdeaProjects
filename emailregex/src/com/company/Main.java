package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main {
    private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final String regex1 = " ^+91[0-9]";
    public static void main(String args[]) {

                List<String> emails = new ArrayList<String>();

        List<String> emails1 = new ArrayList<String>();

        System.out.println("enter the email");
        System.out.println("enter the phoneno");
                Scanner sc = new Scanner(System.in);
                String a = sc.nextLine();
                String b =sc.next();
                emails1.add(b);
                emails.add(a);
                System.out.println(a);
        System.out.println(b);
                Pattern pattern = Pattern.compile(regex);

        Matcher matcher
                = pattern
                .matcher(regex);

        // Get the current matcher state

           Matcher result   = matcher.toMatchResult();
        System.out.println("Current Matcher: "
                + result);
        while (matcher.find()){

            System.out.println(matcher.group());
        }

    }


        }






