package java_fundamental.arrays;
/*
 Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P:
 The given array is :
  1 2
  3 4
 The reverse of the array is :
  4 3
  2 1
 */
public class Program13 {
    public static void main(String[] args){
        if(args.length<4 && args.length>4){
            return;
        }
        int[][] array = new int[][]{
                { Integer.parseInt(args[0]),
                Integer.parseInt(args[1]) },
                { Integer.parseInt(args[2]),
                Integer.parseInt(args[3]) }
        };
        for(int i=1;i>=0;i--){
            for(int j=1;j>=0;j--){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
