package Homework.Dates_Excersizes;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates_Homework {
    public static void main  (String[] args) throws ParseException {

        // Format "Fri, June 7 2013"
        String usedDate = "Fri, June 7 2013";
        SimpleDateFormat sdf =   new SimpleDateFormat("E, MMM dd yyyy"); //Using the 'simple format date class' add in  constructor (date pattern)
        Date formattedDate = sdf.parse(usedDate); //create a reference name and assign it to the object expression.
        System.out.println(formattedDate); //  String format "Fri, June 7 2013

         // Format "Fri, June 7 2013 12:10:56 PM"
         String usedDateTwo = "Fri, June 7 2013 12:10:56 PM";
         SimpleDateFormat sdfTwo =   new SimpleDateFormat("E, MMM dd yyyy k:m:s"); //Using the 'simple format date class' add in  constructor (date pattern)
         Date formattedDateTwo = sdfTwo.parse(usedDateTwo); //create a reference name and assign it to the object expression.
         System.out.println(formattedDateTwo); //  String format Friday, Jun 7, 2013 12:10:56 PM


    }


}
