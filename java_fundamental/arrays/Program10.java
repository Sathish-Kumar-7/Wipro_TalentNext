package java_fundamental.arrays;
/*
Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
 */
public class Program10 {
    public static void main(String[] args){
        int[] array = new int[]{0,1, 0, 1, 0, 0, 1, 1};
        for(int i=0;i< array.length;i++){
            if(array[i]%2==1){
                for (int j=i+1;j<array.length;j++){
                    if (array[j]%2==0){
                        int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                        break;
                    }
                }
            }
        }
        for(int num:array){
            System.out.print(num+" ");
        }
    }
}
