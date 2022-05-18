package java_fundamental.arrays;
/*
 Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P:
The given array is :
1 23 45
55 121 222
56 77 89
The biggest number in the given array is 222
 */
public class Program14 {
    public static void main(String args[]){
        if (args.length==9) {
            int[][] array = new int[][]{
                    {
                            Integer.parseInt(args[0]),
                            Integer.parseInt(args[1]),
                            Integer.parseInt(args[2])
                    },
                    {
                            Integer.parseInt(args[3]),
                            Integer.parseInt(args[4]),
                            Integer.parseInt(args[5])
                    },
                    {
                            Integer.parseInt(args[6]),
                            Integer.parseInt(args[7]),
                            Integer.parseInt(args[8])
                    }
            };
            int max=Integer.MIN_VALUE;
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    if(max<array[i][j])
                        max = array[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
