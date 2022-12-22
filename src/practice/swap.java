package practice;

import java.util.Scanner;

public class swap {
    public static void main(String[] args){

        System.out.println("enter two numbers :");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

//        b=b+a;
//        a=b-a;
//        b=b-a;

//        b=b*a;
//        a=b/a;
//        b=b/a;

        int c=0;
        c=a;
        a=b;
        b=c;


        System.out.println(a);
        System.out.println(b);

    }
}
