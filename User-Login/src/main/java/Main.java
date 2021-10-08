//Program that checks username and password than can reset password if it is wrong
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String userName, password, reset, npassword;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Username : ");
		userName = inp.nextLine();
		
		System.out.print("Passwort : ");
		password = inp.nextLine();
    
		if (userName.equals("patika") && password.equals("java123")) {
		    System.out.println("You are logged in !");
		} else {
		    System.out.println("Username or password is incorrect !");
		    System.out.print("If you want to reset the password, type yes !");
		    reset = inp.nextLine();
		    
        if (reset.equals("yes")) {
		        System.out.print("New password : ");
		        npassword = inp.nextLine();
		        
            if (npassword.equals("java123") || npassword.equals(password)) {
		            System.out.println("Could not create password. Please enter another password !");
		        } else {
		            System.out.println("Password created !");
		        }
		    } else System.out.println("Login failed !");
		}
	}
}
