package Inheritance;
import java.util.Scanner;


public class InheritMe {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(); 

        System.out.println("Here is a little social media/account creator. \n");

        System.out.println("Please enter your name: ");
        String info = scanner.next(); 
        person.setName(info);

        System.out.println("Please enter your age: ");
        int years = scanner.nextInt();
        person.setAge(years);

        person.printAll();

        System.out.println("Would you like to create an account? Yes or No: ");
        String profileCreate = scanner.next(); 
        
        if (profileCreate.equalsIgnoreCase("Yes")) { 
            Username user = new Username(); 
            System.out.println("Thank you, now please enter your username: " + "\n");
            String screen = scanner.next(); 
            user.setUser(screen);
            System.out.println("Your username is: " + screen +"\n");
            System.out.println();
            System.out.println("Please enter a brief biography: \n");
            String characteristics = scanner.next(); 
            user.setBio(characteristics); 
            user.createAccount();
        }
        
        else { 
            System.out.println("We hope you will create an account with us in the future.");
        } 
        scanner.close();
    }
}

// Inheritance - One class acquires the attibutes and methods of another. 