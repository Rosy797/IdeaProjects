
package com.company;

import java.util.*;
class A {
    int n;
    Scanner sc = new Scanner(System.in);

}
class B extends A{
    void input()
    {

        int i;
        System.out.println("enter a number");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(n%i==0)
                System.out.println(i+"");
        }
    }
}
class C extends B
{
    void get()
    {
        int i;
        for(i=0;i<n;i++);
        int sum=0;
        sum=sum+i;
        System.out.println(sum+"");
    }
}
class D extends C{
    void display(){
        int sum;
        for(sum=0;sum<=n;sum++)
            if(sum%2==0)
                System.out.println("super number");
            else
                System.out.println("just a number");
    }
}
class Main1 extends D{
    public static void main(String args[]) {
        Main1 obj = new Main1();
        obj.input();
        obj.get();
        obj.display();
    }
}