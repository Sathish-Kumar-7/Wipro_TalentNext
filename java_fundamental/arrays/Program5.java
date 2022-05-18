package java_fundamental.arrays;

import java.util.Arrays;

/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/
public class Program5 {
    public static void main(String[] args){
        int[] array = new int[]{1,8,3,7,4,6,0,4};
        Arrays.sort(array);
        System.out.println("Maximum 2 Values "+array[array.length-1]+" "+array[array.length-2]);
        System.out.println("Minimum 2 Values "+array[0]+" "+array[1]);
    }
}
