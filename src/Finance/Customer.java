package Finance;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    private String userId;
    private String password;
    private  String[] existingUserIds = {"foo", "bar", "John", "Doe", "James123"};

    public Customer(String firstName, String lastName, String userId, String password) {
        this.firstName = firstName; // use constructor to default customer input values.
        this.lastName = lastName;
       // this.userId = userId;
        this.password = password;

        for (int x = 0; x <= existingUserIds.length - 1; x++) {
            if (!(userId.equals(existingUserIds[x])) && userId.length() >= 3 && (  password != null && password.matches("^[a-zA-Z0-9]*$"))) {
                    this.userId = userId;
                    System.out.println();

                } else{
                    System.out.println("Error: Account ID must be a minimum of 3 characters and must now have been already");
                }
            }
        }

        public String getUserId () {
            return userId;
        }

    public void addAccount(double initialBalance) {  // when creating an account. What do you have to do?
        account = new Account();
        account.setAccountId(account.getNextId());
        account.deposit(initialBalance);
        account.displayAccountDetails();
    }

    //public static boolean isAlphaNumeric(String password) {
    //    return password != null && password.matches("^[a-zA-Z0-9]*$");
    }


