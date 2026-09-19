public class switch8{
     public static void main(String[] args) {

        int choice = 1;
        int option = 2;
        int balance = 10000;

        switch (choice) {

            case 1:
                System.out.println("ATM Selected");

                switch (option) {

                    case 1:
                        System.out.println("Balance = " + balance);
                        break;

                    case 2:
                        int withdraw = 2000;

                        if (withdraw <= balance) {
                            balance = balance - withdraw;
                            System.out.println("Withdrawal Successful");
                            System.out.println("Balance = " + balance);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                    case 3:
                        System.out.println("Deposit");
                        break;

                    default:
                        System.out.println("Invalid Option");
                }
                break;

            default:
                System.out.println("Invalid ATM Choice");
        }
    }
}