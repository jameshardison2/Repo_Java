package Practice;

public class HelloWorld {

    //Constants are block-scoped, much like variables defined using the data types and variable name.
    //The value of a constant can not change through reassignment, and it cant be redeclare.
    // When working with sensitive information leave room for error without using a constant



    public static void main(String[] args)  {

        int accountBalance = 100;
        accountBalance = accountBalance + 200;

        final int routingNumber = 9001;
        //routingNumber = 900;
        System.out.println(accountBalance);

      //  int myAge = 33;
      //  int age = 33;

      //  System.out.println("My age is: " + age);

       // age = 33 + 10;

     //   System.out.println("My age after a decade is: " + age);


        //Variable Rules
        // Cannot be a reserved word
        // Cannot start with a number
        // Cannot contain a hyphen or space
        // Should be camelCase
        // Should be a meaningful name


    }
}
