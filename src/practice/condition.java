package practice;

import java.util.*;

public class condition {
    public static void main(String[]arg)
    {
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("adult");

        }
        else{
        System.out.println("not adult");
    }
    }
}
