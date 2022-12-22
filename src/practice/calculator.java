package practice;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        double num1;
        double num2;
        double ans;
        char op;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two number: ");
        num1= sc.nextDouble();
        num2= sc.nextDouble();
        System.out.println("enter an operator(+,-,*,/):");
        op= sc.next().charAt(0);
        switch (op){
            case'+':
                ans=num1+num2;
                break;
            case'-':
                ans= num1-num2;
                break;
            case'*':
                ans= num1*num2;
                break;
            case'/':
                ans=num1/num2;
                break;
            default:
                System.out.println("invalid");
                return;


        }
        System.out.println("results are");
        System.out.println(num1+""+op+""+""+num2+"="+ans );




    }
}
