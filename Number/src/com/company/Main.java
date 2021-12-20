package com.company;
import java.util.*;
class A {
    int n;
    Scanner sc = new Scanner(System.in);

}
class B extends A{
    int i;
    int sum=0;
    void input()
    {


        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
                System.out.println(i+"");

        }
        sum=sum+i+n;
        System.out.println("sum" +sum);
    }
}


class D extends B{
    void display(){

        if(sum%2==0)
            System.out.println("super number");
        else
            System.out.println("just a number");
    }
}
class Main{
    public static void main(String args[]) {
        D obj = new D();
        obj.input();

        obj.display();
    }
}

