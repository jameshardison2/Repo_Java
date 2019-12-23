package Homework;

public class JavaHomework2 {

    public static void main(String[] args) {

        String questionOne = "Answers to question 1:";
        String questionTwo = "Answers to question 2:";
        String questionThree = "Answers to question 3:";
        String questionFour = "Answers to question 4:";
        String divider = "////////////////////////////////////////////";


        System.out.println(questionOne);
        String myStatement = "I am a good programmer";
        String [] myStatementNoProgrammer = myStatement.split("programmer");
        for (String noProgrammer : myStatementNoProgrammer) {
            System.out.println(noProgrammer);
        }

        String[] numberOfWords = myStatement.split(" ");
        System.out.println(numberOfWords.length);

        System.out.println(myStatement.replaceAll("r", "f"));



        System.out.println(divider);
        System.out.println(questionTwo);

        String myName = "James N. Hardison II";
        String [] myNameSplit = myName.split(" ");
        for (String myNameLength : myNameSplit) {

            //myName.indexOf("James", "N.", "Hardison", "II");
            System.out.println(myNameLength);
        }



        System.out.println(divider);
        System.out.println(questionThree);

        String [] names = {"mohammad", "John", "Ferdous", "Abdul", "Ratna", "Mareeha", "Ruslan", "Himani"};
        System.out.println(names[1]);




        System.out.println(divider);
        System.out.println(questionFour);

        String[] colleagues = {"Kevin", "Doug", "Anwar", "Matt", "Marie"};
        System.out.println(colleagues.length);
        System.out.println(colleagues[2]);
        for (String namePrintout : colleagues) {
            System.out.println(namePrintout);
        }

        boolean startWithA = colleagues[1].startsWith("A");
        //System.out.println(startWithA);



    }



}
