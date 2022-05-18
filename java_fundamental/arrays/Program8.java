package java_fundamental.arrays;
/*
 Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
 */
public class Program8 {
    public static void main(String[] args){
        int[] array = new int[]{1,6,4,7,9};
        boolean flag = false;
        int sum=0;
        counter:
        for(int i=0;i<array.length;i++){
            if(array[i]==6){
                for(int j=i+1;j< array.length;j++)
                    if (array[j]==7){
                        i=j;
                        continue counter;
                    }
            }
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
