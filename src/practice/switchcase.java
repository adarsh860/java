package practice;

import java.util.Scanner;

public class switchcase {
    public static void main(String[]arg){
        Scanner sc =new Scanner(System.in);
        int button= sc.nextInt();
        switch (button){
            case 1:
                System.out.println("abdul");
                break;
            case 2:
                System.out.println("anubhav");
                break;
            case 3:
                System.out.println("karan");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
