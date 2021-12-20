package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int n;
n=sc.nextInt();




        while(n != -1)   // or you can put while (1) too...
        {

            System.out.println("choose the option");
            System.out.println("1:add");
            System.out.println("2:search");
            System.out.println("3:delete");
            System.out.println("4:exit");
            System.out.println("enter the option");




            n = sc.nextInt();
            switch (n) {
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                   return;




            }

        }
    }

    private static void delete() {
        Map<String, Map<String, String>> maps = new HashMap<String, Map<String, String>>();
        {


            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 1; i++) {
                System.out.println("phone number");
                String phone = sc.next();
                Map<String, String> map = new HashMap<String, String>();
                System.out.println("enter name");
                map.put("name", sc.next());
                System.out.println("email");
                map.put("email", sc.next());
                maps.remove(phone, map);
            }
            System.out.println(maps);


        }
    }


    private static void add() {
        Scanner sc=new Scanner(System.in);
        Map<String, Map<String, String>> maps = new HashMap<String, Map<String, String>>();
        {
            for (int i = 0; i < 1; i++) {
                System.out.println("email");
                String email = sc.next();
                Map<String, String> map = new HashMap<String, String>();
                System.out.println("enter name");
                map.put("name", sc.next());
                System.out.println("phone number");
                map.put("phone number", sc.next());
                System.out.println("enter email");
                map.put("email", sc.next());
maps.put(email,map);
                maps.get(email);



            }
            System.out.println(maps);

        }



    }



    private static void  search() {
        Map<String, Map<String, String>> maps = new HashMap<String, Map<String, String>>();
        {


            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 1; i++) {
                System.out.println("name");
                String email = sc.next();
                Map<String, String> map = new HashMap<String, String>();
                System.out.println("enter name");
                map.put("name", sc.next());
                System.out.println("phone number");
                map.put("phone", sc.next());
                maps.put(email,map);
                maps.get(email);
            }
            System.out.println(maps);

        }




    }

}
