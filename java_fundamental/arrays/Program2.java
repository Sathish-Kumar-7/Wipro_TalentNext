package java_fundamental.arrays;

import java.util.Scanner;

/*
Write a program to initialize an integer array and find the maximum and minimum value of the array.
 */
public class Program2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size =");
        int num = input.nextInt();
        int[] array = new int[num];
        System.out.print("Enter Array Items");
        for(int i=0;i<num;i++){
            array[i]=input.nextInt();
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int n:array){
            if(n>max)
                max=n;
            if (min>n)
                min=n;
        }
        System.out.println("Minimum ="+min);
        System.out.println("Maximum ="+max);
    }
}
