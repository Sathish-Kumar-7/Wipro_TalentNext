package java_fundamental.flowcontrol;

import java.util.Scanner;

/*
 Write a program to check if a given number is prime or not.
 */
public class Program12 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number");
        int num = input.nextInt();
        boolean flag= true;
        if(num==1)
            flag = false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                flag = false;
        }
        if(flag)
            System.out.println("Is Prime Number");
        else System.out.println("Not A Prime Number");
    }
}
