package java_fundamental.arrays;
/*
 Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
 */
public class Program7 {
    public static void main(String[] args){
        int[] array = new int[]{12,34,12,45,67,34,10,89,67,9};
        int i=0;
        int num =array.length;
        for(i=1;i<num;){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(array[j]==array[i]){
                    flag = true;
                }
            }
            if(flag){
                for(int k = i;k< array.length-1;k++){
                    array[k]=array[k+1];
                }
                num--;
            }else i++;
        }
        for (int j=0;j<num;j++){
            System.out.print(array[j]+" ");
        }
    }
}
