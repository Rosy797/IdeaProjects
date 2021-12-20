package com.company;
import java.sql.SQLOutput;
import java.util.*;
class Course {
    int branch;
    String name;

    void number() {
        Scanner sc = new Scanner(System.in);
        branch = sc.nextInt();
        name = sc.nextLine();
        switch (branch) {
            case 1:
                name = "it";
                break;

            case 2:
                name = "cs";
                break;

            case 3:
                name = "mechanical";
                break;
            case 4:
                name = "ec";
                break;
            case 5:
                name = "civil";
                break;
        }
        System.out.println(" branch name " + name);
    }
}

class Subject extends Course {
    char branch1;
    int profname;

    void display() {
        switch (profname) {
            case 1:
                System.out.println("courses");

                switch (branch) {
                    case 'C':
                        System.out.println("ml");
                        break;
                    case 'E':
                        System.out.println("ai");
                        break;
                    case 'M':
                        System.out.println("iot");
                        break;
                }
            switch (branch1) {
                case 'C':
                    System.out.println("aa");
                    break;
                case 'E':
                    System.out.println("bb");
                    break;
                case 'M':
                    System.out.println("cc");
                    break;
            }

            break;

        }
        System.out.println(branch1);
    }
}


public class Main {

    public static void main(String[] args)
    {
       Subject obj=new Subject();
       obj.number();
        obj.display();

    }
    }
