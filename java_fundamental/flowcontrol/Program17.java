package java_fundamental.flowcontrol;
/*
 Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
 */
public class Program17 {
    public static void main(String[] args){
        int num = 11011;
        boolean flag = true;
        for(int i=0;i<String.valueOf(num).length()/2;i++){
            if(String.valueOf(num).charAt(i) != String.valueOf(num).charAt(String.valueOf(num).length()-1-i))
                flag = false;
        }
        if (flag)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
