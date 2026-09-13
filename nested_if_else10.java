public class nested_if_else10 {
      public static void main(String[] args) {

        int balance = 10000;
        int amount = 5000;
        int pin = 1234;
        int enteredPin = 1234;

        if (enteredPin == pin) {

            if (amount > 0) {

                if (amount <= balance) {

                    if (amount % 100 == 0) {
                        balance = balance - amount;

                        System.out.println("Withdrawal Successful");
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Enter amount in multiples of 100");
                    }

                } else {
                    System.out.println("Insufficient Balance");
                }

            } else {
                System.out.println("Invalid Amount");
            }

        } else {
            System.out.println("Wrong PIN");
        }
    }
    
}
