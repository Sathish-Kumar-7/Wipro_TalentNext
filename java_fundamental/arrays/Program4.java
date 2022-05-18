package java_fundamental.arrays;
/*
Initialize an integer array with ascii values and print the corresponding character values in a single row.
 */
public class Program4 {
    public static void main(String args[]) {
        int[] array = new int[]{23, 122, 68, 97, 31, 63};
        for (int a : array) {
            System.out.print((char) a + " ");
        }
    }
}
