package Classwork;


public class TempCalc {
    public static void main(String[] args) {

        double fahrenheit = 60; // Should return 0•C , 273.115K

        // T(•C) = (68•F -32) x 5/9 = 20• C

        double celsius = (fahrenheit - 32) * 5 / 9;
       // System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius +" degrees celsius.");

        //T(k) = (60•F + 459.67) X 5/9 = 288.71 K
        double kelvin = (fahrenheit + 459.67) * 5 / 9;
        System.out.println(kelvin);
    }

}