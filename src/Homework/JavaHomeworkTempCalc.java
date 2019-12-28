package Homework;

public class JavaHomeworkTempCalc {

    public static void main(String[] args) {

        String firstanswer = "Convert Celsius to Kelvin:";
        String secondanswer = "Convert Celsius to Fahrenheit:";
        String thirdanswer = "Convert Kelvin to Celsius:";
        String fourthanswer = "Convert Kelvin to Fahrenheit:";


        System.out.println(firstanswer);
        double celsius = 70;
        double kelvin = celsius + 273.15; //T(K) = T(°C) + 273.15
        System.out.println(kelvin);

        System.out.println(secondanswer);
        double fahrenheit = (celsius * 9 / 5) + 32; // T(°F) = T(°C) × 9/5 + 32
        System.out.println(fahrenheit);

        System.out.println(thirdanswer);
        kelvin = 100;
        celsius = kelvin - 273.15; // T(°C) = T(K) - 273.15
        System.out.println(celsius);

        System.out.println(fourthanswer);
        fahrenheit = (kelvin * 9 / 5) - 459.67; // T(°F) = T(K) × 9/5 - 459.67
        System.out.println(fahrenheit);



    }


}
