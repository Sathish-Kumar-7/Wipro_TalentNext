package java_fundamental.arrays;
/*
Write a program to initialize an array and print them in a sorted order.
 */
public class Program6 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 8, 3, 7, 4, 6, 0, 4};
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i:array)
            System.out.print(i+" ");
    }
}
