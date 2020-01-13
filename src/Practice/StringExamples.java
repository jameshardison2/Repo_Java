package Practice;

public class StringExamples {
    public static void main(String[] args) {

        String firstName = "James";
        String lastName = "Hardison";

        String fullName = firstName + " " + lastName;

        int fullNameLength = fullName.length();
        System.out.println(fullName.length());    //string method of length

        String message = "This is \"my\" Message"; //ignore quotes in a string
        System.out.println(message);

        String lowerCaseName = fullName.toLowerCase();
        System.out.println(lowerCaseName);

        String upperCaseName = fullName.toUpperCase();
        System.out.println(upperCaseName

        );




    }
}
