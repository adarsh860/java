package practice;

import java.util.Scanner;

public class ifelsemarks {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your subject name: ");
        String name = sc.nextLine();
        System.out.println("enter your marks: ");
        int marks = sc.nextInt();

         if (marks>90){
             System.out.println("Grade A+");
         }
         else if (marks>80) {
             System.out.println("Grade A");
         }
         else if (marks>70) {
             System.out.println("Grade B+");
         }
         else if (marks>60) {
             System.out.println("Grade B");
         }
         else{
             System.out.println("Pass with Grace");
         }

    }
}
