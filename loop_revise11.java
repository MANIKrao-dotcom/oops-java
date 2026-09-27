public class loop_revise11 {
     public static void main(String[] args) {

        String[] customers = {"Manu", "Rahul", "Arun"};

        int[][] transactions = {
            {5000, -2000, 3000, -1000},
            {10000, -4000, -2000, 5000},
            {7000, -1500, 2000, -3000}
        };

        for (int i = 0; i < customers.length; i++) {

            int balance = 0;
            int deposit = 0;
            int withdrawal = 0;

            System.out.println("\nCustomer: " + customers[i]);

            for (int j = 0; j < transactions[i].length; j++) {

                int amount = transactions[i][j];

                if (amount > 0) {
                    deposit = deposit + amount;
                } 
                else {
                    withdrawal = withdrawal + (-amount);
                }

                balance = balance + amount;

                System.out.println("Transaction " + (j + 1)
                                   + ": ₹" + amount);
            }

            System.out.println("Total Deposit = ₹" + deposit);
            System.out.println("Total Withdrawal = ₹" + withdrawal);
            System.out.println("Final Balance = ₹" + balance);
        }
    }  
}
