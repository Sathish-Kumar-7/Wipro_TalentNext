package java_fundamental.arrays;
/*
 Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
 */
public class Program3 {
    public static void main(String[] args){
        int[] array = new int[]{1,7,3,0,4,32};
        int search = 0,flag=-1;
        for (int i=0;i< array.length;i++){
            if(array[i]==search){
                flag=i;
                break;
            }
        }
        System.out.println(flag);
    }
}
