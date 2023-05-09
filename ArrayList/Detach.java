package ArrayList;
import java.util.ArrayList;

public class Detach { 
    public static void main(String[] args) { 
        ArrayList<String> zodiac = new ArrayList<String>(); 

        zodiac.add("Pisces");
        zodiac.add("Gemini"); 
        zodiac.add("Libra"); 

        zodiac.set(0, "Aquarius");
        zodiac.remove(3); 

        for(int i = 0; i < zodiac.size(); i++) { 
            System.out.println(zodiac.get(i));
        }

    }
}

//  What is an array list? 
// An array list is a resizable array, elements can be added and removed after compilation phase store ONLY reference data types. 
// Import the package
// Declare data types
//add(), get(), size(), set(), remove(), clear() methods. 