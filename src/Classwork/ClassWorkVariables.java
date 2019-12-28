package Classwork;

public class ClassWorkVariables {

    public static void main(String[] args) {

        String myStatement = "I am a good programmer";
        System.out.println(myStatement.length());
        System.out.println(myStatement.toLowerCase());

        boolean myStatementContains = myStatement.contains("mohammad");
        System.out.println(myStatementContains);

        System.out.println(myStatement.charAt(5));

        System.out.println(myStatement.indexOf("h"));

        boolean myStatementEmpty = myStatement.isEmpty();
        System.out.println(myStatementEmpty);

        String technosoft = "This is Technosoft";
       int myStatementCompare = myStatement.compareTo(technosoft);
        System.out.println(myStatementCompare);

        Boolean myStatementStartsWith = myStatement.startsWith("Welcome");
        System.out.println(myStatementStartsWith);

        boolean myStatementEndsWith = myStatement.endsWith("Goodbye");
        System.out.println(myStatementEndsWith);


        String seperationLine = "////////////////////////////////////////////////////";
        System.out.println(seperationLine);



        String[] cars = new String[5];
        cars[0] = "Tesla";
        cars[1] = "Honda";
        cars[2] = "Kia";
        cars[3] = "Audi";
        cars[4] = "BMW";

        int size = cars.length;
        System.out.println("The Array lenght is " + size);

        System.out.println(cars[4]);


        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Sunday";
        daysOfWeek[1] = "Monday";
        daysOfWeek[2] = "Tuesday";
        daysOfWeek[3] = "Wednesday";
        daysOfWeek[4] = "Thursday";
        daysOfWeek[5] = "Friday";
        daysOfWeek[6] = "Saturday";

        String [] days = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};

        //System.out.println(daysOfWeek[]);


    }
}


/**
 * Class work:
 * 1. Declare a Variable as following: String myStatement = "I am a good programmer";
 * 2. Find the length of "myStatement"
 * 3. Convert all values to lowercase.
 * 4. see if statement contains mohammad
 * 5. find the 5th index of the statement
 * 6. find if the statement is empty
 * 7. compare the "myStatement" with "technosoft"
 * 8. check if message starts with welcome
 * 9. check if message ends with "Good Bye"
 **/