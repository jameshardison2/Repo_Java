package Classwork.Animals;

public class Mammals {

    //Attributes:

    int hands = 2;
    int legs = 2;
    String hair = "Black";
    int wings = 0;

    // Action or methods:
    public String walk()    {
        String doing = "Walk";
        System.out.println("Walk");
        return doing;
    }

    public String sleep()    {
        String sleep = "Sleep";
        System.out.println("Sleep");
        return sleep;

    }
    public String drink()    {
        String drink = "Drink";
        System.out.println("Drink");
        return drink();
    }

    public String eat()    {
        String eat = "Eat";
        System.out.println("Eat");
        return eat;
    }
    public String showaltattributes()    {
        String showAllAltributes = "Show All Attributes";
        System.out.println(hair + hands + wings);
        return showAllAltributes;
    }


}
