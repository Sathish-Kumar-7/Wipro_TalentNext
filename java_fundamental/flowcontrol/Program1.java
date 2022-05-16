package java_fundamental.flowcontrol;
/*
A) Write a program to check if a given integer number is Positive, Negative, or Zero.

B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.

     lastDigit(7, 17) → true
     lastDigit(6, 17) → false
     lastDigit(3, 113) → true
 */
public class Program1 {
    static void positiveNegativeZero(int num){
        if(num == 0)
            System.out.println("Zero");
        else if (num>0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");
    }
    static void lastDigitMatching(int num1,int num2){
        String num1String = String.valueOf(num1);
        String num2String = String.valueOf(num2);
        if(num1String.charAt(num1String.length()-1) == num2String.charAt(num2String.length()-1))
            System.out.println(true);
        else
            System.out.println(false);
    }
    public static void main(String args[]){
        positiveNegativeZero(12);
        positiveNegativeZero(-12);
        positiveNegativeZero(0);
        lastDigitMatching(12,142);
        lastDigitMatching(34,123);
    }

}
