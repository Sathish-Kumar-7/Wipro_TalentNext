package java_fundamental.flowcontrol;
/*
Initialize a character variable in a program and

print 'Alphabhet' if the initialized value is an alphabhet,

print 'Digit' if the initialized value is a number, and

print 'Special Character', if the initialized value is anything else.
 */
public class Program5 {
    public static void main(String[] args){
        char character = '*';
        if(character >= 65 && character<=90 || character >= 97 && character<=122)
            System.out.println("Alphabet");
        else if (character>=48 && character<=57)
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}
