package java_fundamental.flowcontrol;

/*
Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
 */

public class Program7 {
    public static void main(String args[]){
        char character = 'a';
        if(character>=65 && character<=90){
            System.out.println((char)(character+32));
        } else if (character>=97 && character<=122) {
            System.out.println((char)(character-32));
        }
    }
}
