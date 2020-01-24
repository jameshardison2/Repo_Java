package Practice;

import java.util.Arrays;

public class Exam {

    public static void main(String[] args){

        String[] names = {"Jason", "Tom", "Jerry", "James"};

        for (int i= 0; i<=names.length-1; i++){
            System.out.println(names[i]);
        }

        String statement = "Lets learn something new";
        String[]splitStatement= statement.split("ea");
        System.out.println(Arrays.toString(splitStatement));
        for (int i= 0; i<=splitStatement.length-1; i++) {
            System.out.println(splitStatement[i]);
        }

        String myName = "Grow";
        String[]myNameSplit = myName.split("");
        System.out.println(Arrays.toString(myNameSplit));

        char[] strArr = myName.toCharArray();
        System.out.println(Arrays.toString(strArr));

        int w = 10;

        while (w<=15){
            System.out.println(w);
            w++;
        }
        int d = 10;
        do{
            System.out.println(d);
        } while (d>15);
            w++;

        //System.out.println(splitStatement);
    }


}
