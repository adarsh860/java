package loops;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        int index=1;
        while (index<=6){
            System.out.println(name);
            index++;
        }
    }
}
