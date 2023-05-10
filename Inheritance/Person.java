package Inheritance;

public class Person {
    private int age;
    private String lastName;

    public void setName(String userName) { 
        lastName = userName;
    }

    public void setAge(int numYears) { 
        age = numYears;
    }

    public void printAll() { 
        System.out.println("Your name is: " + lastName);
        System.out.println("You are: " + age + " years old.");

    }
}
