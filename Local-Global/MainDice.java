public class MainDice { 
    public static void main(String[] args) { 
        //local = declared inside a method
        //        visible only to that method

        //global = declared outside a method, but within a class
        //         visible to all parts of a class

        DiceRoller diceRoller = new DiceRoller(); 
        System.out.println(diceRoller);
    }
}