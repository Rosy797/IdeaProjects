package com.company;
import java.util.*;

class Mapping {
            public static void main(String args[]) {

                Map<String, Map<String, String>> maps = new HashMap<String, Map<String, String>>();
                {



                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("employee email");
                    String email = sc.next();
                    Map<String, String> map = new HashMap<String, String>();
                    System.out.println("enter name");
                    map.put("name", sc.next());
                    System.out.println("phone number");
                    map.put("phone number", sc.next());
                    System.out.println("enter email");
                    map.put("email", sc.next());
                    maps.put(email,map);
                }
                    System.out.println(maps);

            }
        }}