package practice;
import java.util.*;

public class oddeven {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
