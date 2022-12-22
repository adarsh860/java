package loops;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        int i=1;
        do {
            System.out.println(name);
            i++;
        }while (i<=6);
        }
}
