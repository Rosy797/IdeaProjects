package com.company;
import java.util.regex.*;
import java.util.Scanner.*;
public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

              System.out.println("Enter your Email: ");
             String email = sc.nextLine();
        System.out.println("enter mobile number");
        String phone=sc.nextLine();
        String regex
                = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

        System.out.println("The phone number is: " + phone);

        System.out.println("the email adress is"+ email);

        boolean result = email.matches(regex);
        if(result) {
            System.out.println("Given email-id is valid");
        } else {
            System.out.println("Given email-id is not valid");
        }
        boolean result1 = phone.matches(regex1);
        if(result1) {
            System.out.println("Given phone number is valid");
        } else {
            System.out.println("Given phone number is not valid");
        }
            }
          }
