package java_fundamental.flowcontrol;
/*
 Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%
 */
public class Program6 {
    public static void main(String[] args){
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        if(gender.toLowerCase().equals("female") && age >=1 && age<=58)
            System.out.println("8.2%");
        else if (gender.toLowerCase().equals("female") && age >=59 && age<=100)
            System.out.println("9.2%");
        else if (gender.toLowerCase().equals("male") && age >=1 && age<=58)
            System.out.println("8.4%");
        else if (gender.toLowerCase().equals("male") && age >=59 && age<=100)
            System.out.println("10.5%");
    }
}
