package practice;

import java.util.Scanner;

public class nextline {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter ur age");
        int age= sc.nextInt();
        System.out.println("enter ur age "+ age );

        System.out.println("enter your name");
        sc.nextLine(); //next line is an exception & it is searching foe an enter. so it is an dummy statement to fullfill the enter statement:
        String name= sc.nextLine();
        System.out.println("your name is "+ name);

    }
}
