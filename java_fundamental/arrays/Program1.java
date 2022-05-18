package java_fundamental.arrays;
/*
Write a program to initialize an integer array and print the sum and average of the array.
 */
public class Program1 {
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6};
        int sum=0;
        for(int num:array)
            sum+=num;
        System.out.println("Sum "+sum+"\nAverage "+sum/(float)array.length);
    }
}
