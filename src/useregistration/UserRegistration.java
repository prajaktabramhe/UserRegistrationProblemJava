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
        //calling method to validate Last  Name
        validateUserLastName();
        //calling method to validate Email Id
        validEmail();
        //calling method to validate Mobile No
        validMobileNo();
    }
    //Define method to validate first name
    public static void validateUserData()
    {
        System.out.println("Enter Your First name");
        String name = scan.nextLine();

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
        String name = scan.nextLine();

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

    //Define method to validate email id
    public static void validEmail()
    {
        System.out.println("Enter Your Email");
        String name = scan.nextLine();

        System.out.println("The Email is: " + name);
        String pattern = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }

    //Define method to validate Mobile No
    public static void validMobileNo()
    {
        System.out.println("Enter Your Mobile No.");
        String name = scan.nextLine();

        System.out.println("The Mobile No is: " + name);
        String pattern =  "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
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
