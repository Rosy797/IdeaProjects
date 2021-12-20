package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {

        Collection<Contact>c=new ArrayList<Contact>();
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.insert");
            System.out.println("2.display");
            System.out.println("3.search");
            System.out.println("4.delete");
            System.out.println("enter your choice: ");
            ch=sc.nextInt();
            System.out.println("enter phoneno");
            phoneno=sc.nextInt();
            System.out.println("enter name");
            name=sc.nextLine();
            System.out.println("enter email");
            email=sc.nextLine();
        }
        while(ch!=0);
    }
}