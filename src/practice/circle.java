package practice;

import java.util.Scanner;

public class circle {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of radius: ");
        int r= sc.nextInt();
        double perimeter;
        double area;
        perimeter= 2*3.14*r;
        area= 3.14*r*r;
        System.out.println("the perimeter of circle is "+perimeter+" the area of circle is "+area);

    }
}
