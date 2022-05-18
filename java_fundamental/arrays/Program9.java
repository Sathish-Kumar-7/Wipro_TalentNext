package java_fundamental.arrays;
/*
Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
 */
public class Program9 {
    public static void main(String[] args){
        int[] array = new int[]{1, 10, 10, 2};
        for (int i=0;i< array.length;i++){
            if (array[i]==10){
                array[i]=0;
                for (int j=i;j<array.length-1;j++){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                i--;
            }
        }
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}
