package loops;

import java.util.Scanner;

public class starprint {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of rows: ");
        int n= sc.nextInt();
        int j;
        int i;
        for(i=1;i<=n; i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
