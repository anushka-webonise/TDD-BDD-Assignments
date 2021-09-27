/*A password is considered valid if all the following constraints are satisfied:

It contains at least 8 characters and at most 20 characters.
It contains at least one digit.
It contains at least one upper case alphabet.
It contains at least one lower case alphabet.
It contains at least one special character which includes !@#$%&*()-+=^.
It doesn’t contain any white space.*/
  
import java.util.regex.*;
import java.util.Scanner;
public class TestPassword {
  
    // Driver Code.
    public static void main(String args[])
    {
  PasswordValidation pwd = new PasswordValidation();
        /*
		Scanner scn = new Scanner(System.in);
		String passwordentered= scn.next();*/
		
		
		//making appropriate test cases to check the program
		//Test case#1
		//passing null string
        String str1 = "";
		System.out.println("Test case#1 "  +str1);
        System.out.println(pwd.isPasswordValid(str1));
  
        //Test case#2
		//checking condition 1 
        String str2 = "An1!";
		System.out.println("Test case#2 " +str2);
        System.out.println(pwd.isPasswordValid(str2));
  
        //Test case#3
		//checking condition 2
        String str3 = "Anushka&!";
		System.out.println("Test case#3 " +str3);
        System.out.println(pwd.isPasswordValid(str3));
  
        //Test case#4
		//checking condition 3
        String str4 = "anushka&1";
		System.out.println("Test case#4 " +str4);
        System.out.println(pwd.isPasswordValid(str4));
  
        //Test case#5
        //checking condition 4
        String str5= "ANUSHKA&1";
		System.out.println("Test case#5 " +str5);
        System.out.println(pwd.isPasswordValid(str5));
  
        //Test case#6
		//checking condition 5
        String str6= "Anushka121";
		System.out.println("Test case#6 " +str6);
        System.out.println(pwd.isPasswordValid(str6));
		
		  //Test case#7
		//checking condition 6
        String str7= "Anushka1 &1";
		System.out.println("Test case#7 " +str7);
        System.out.println(pwd.isPasswordValid(str7));
		
		  //Test case#8
		//checking valid password
        String str8= "Anushka12@";
		System.out.println("Test case#8 " +str8);
        System.out.println(pwd.isPasswordValid(str8));
    }
}