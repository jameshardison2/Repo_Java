package Homework.MidTerm;

import java.util.Arrays;

public class Missing {


    int[] myArray = {1, 3, 5, 4, 2, 7};
    int sum = myArray.length + 1;


    public int[] getMyArray() {

         Arrays.sort(myArray);     //Sorts the Arrays


        return myArray;
    }
}
