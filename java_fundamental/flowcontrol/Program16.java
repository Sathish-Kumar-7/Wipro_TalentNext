package java_fundamental.flowcontrol;
/*
 Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
 */
public class Program16 {
    public static void main(String[] args){
        int num = 1423,rev=0;
        while(num>0){
            rev +=Math.pow(10,String.valueOf(num).length()-1)*(num%10);
            num=num/10;
        }
        System.out.println(rev);
    }
}
