package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesDemo{
    public static void main(String[] args) throws ParseException { //warning, possibility that I messed up, possible error.

        //Default current date
        //Date date = new Date();
        //System.out.println(date); // This will print the standard date format from Java

        //Format date
        //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); //The string is the format that you want.
        //System.out.println(sdf.format(date)); // expression of the SimpleDateformat instance with it corresponding format method, with date object as argument.
        //String formattedDate = sdf.format(date); //Object of the above expression.
        //System.out.println(formattedDate);


        //How to convert a date from string data-type to a date data-type
        String dateInString = "07-06-19"; // In this example the date is coming in from API as a string type
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YY"); //Use the date pattern of the string is using
        Date date = formatter.parse(dateInString);     //Parse the date, make sure the date coming as string matches the formatter pattern.
        System.out.println(date);



    }
}
