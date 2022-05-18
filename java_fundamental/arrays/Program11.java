package java_fundamental.arrays;
/*
Given an array of type int, print true if every element is 1 or 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */
public class Program11 {
    public static void main(String[] args){
        boolean flag = true;
        int[] array = new int[]{1, 4, 2, 4};
        for (int i=0;i< array.length;i++){
            if (array[i]!=1 && array[i]!=4){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
