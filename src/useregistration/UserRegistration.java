package useregistration;
import java.util.Scanner;
import java.lang.*;
public class UserRegistration
{
    private static final Scanner scan = new Scanner(System.in);

    public static  void main(String[] args)
    {
        //calling method to validate first Name
        validateUserData();
        //calling method to validate Last Name
        validateUserLastName();
    }
    //Define method to validate first name
    public static void validateUserData()
    {
        System.out.println("Enter Your First name");
        String name = scan.next();
        System.out.println("The first name is: " + name);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }
    //Define method to validate Last name
    public static void validateUserLastName()
    {
        System.out.println("Enter Your Last name");
        String name = scan.next();
        System.out.println("The Last name is: " + name);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";

        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }


}
