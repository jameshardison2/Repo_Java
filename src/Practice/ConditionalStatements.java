package Practice;

import javax.swing.*;

public class ConditionalStatements {

    public static void main(String[] args) {
        // If hour is between 0600 and 1159 : Greet Good Morning
        // If hour is between 1200 and 1759: Greet Good Evening
        // Good Night

        int hour = 1900;
        if (hour >= 0600 && hour <= 1159){
//            System.out.println("Greet Good Morning");
        } else if(hour >= 1200 && hour <= 1759) {
//            System.out.println("Greet Good Evening");
        } else {
//            System.out.println("Greet Good Night");
        }

        boolean isAccountLocked = false;
        String userRole = "James";
        String reason = "Unpaid membership";

        if  (isAccountLocked == false ) {
//            System.out.println("Account is Locked for " + userRole + " do to  " + reason);
        } else if (userRole.equals("admin")) {
//            System.out.println("Welcome Admin User");
        } else if (userRole.equals("James")){
//            System.out.println("Welcome James!");
        } else {
//            System.out.println("Incorrect Username. Try again");
        }
        //1. If customer has $1000 or more on the checking account and iPhone X is available in inventory
        //Available on the Inventory then display alert saying "You can go to store  and purchase  the iPhone"
        //2. If customer has a credit score greater than 600 or customer has $1000 in account

        int customerCheckingBalance = 999;
        int iphoneInventory  = 1;
        int customerCreditScore = 599;

        if(customerCheckingBalance >= 1000 && iphoneInventory > 0) {
            System.out.println("You can purchase Iphone!");
        }else if (customerCreditScore > 600 || customerCheckingBalance >= 1000){
            System.out.println("You are eligible" );
        }else {
            System.out.println("You are not eligible for an iPhone");
        }

        // Nested If Else statements

          int temp = 74;
          String weatherType = "Hot";

          if(temp < 32) {
              System.out.println("Its cold outside");
              if (weatherType.equals("snow")) {
                  System.out.println("Wear Snow-gear today!");
              } else {
                  System.out.println("Its no snow today!");
              }

          }else {
              System.out.println("ERROR: Invalid weather details");
          }


    }

}
