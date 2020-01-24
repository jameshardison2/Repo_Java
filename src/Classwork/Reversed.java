package Classwork;

public class Reversed {

    public static void main(String[] args) {


        String myString = "Reverse";
        int stringLength = myString.length();//length function variable
        String reversed = "";

        //string myReverse = reverse + myString.charAt(stringLength-1);
        for (int i = 0; i <= stringLength-1; i++);{
            reversed = reversed + myString.charAt(stringLength-1); //print the characters of the respective index numbers
            System.out.println(reversed);
        }


    }

}
