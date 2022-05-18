package java_fundamental.flowcontrol;
/*
Write a program to print prime numbers between 10 and 99.
 */
public class Program13 {
    static boolean isPrime(int num){
        boolean flag= true;
        if(num==1)
            flag = false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                flag = false;
        }
        return flag;
    }
    public static void main(String[] args){
        for(int i = 10;i<=99;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
}
