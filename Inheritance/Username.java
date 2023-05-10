package Inheritance;

public class Username extends Person {
    private String screenName;
    private String bio;

    public void setUser(String display) { 
        screenName = display;
    }

    public void setBio(String biography) { 
        bio = biography; 
    }

    public void createAccount() { 
        System.out.println("Your username is: " + screenName);
        System.out.println("Your bio will be displayed like this: ");
        System.out.println(bio);
    }
}
