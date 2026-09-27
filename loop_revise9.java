public class loop_revise9 {
      public static void main(String[] args) {

        double[] loans = {50000, 100000, 150000};

        for (int i = 0; i < loans.length; i++) {

            System.out.println("\nLoan Amount: ₹" + loans[i]);

            double balance = loans[i];

            for (int month = 1; month <= 5; month++) {

                double interest = balance * 0.01;
                balance = balance + interest - 10000;

                if (balance < 0) {
                    balance = 0;
                }

                System.out.println("Month " + month +
                                   " Balance: ₹" + balance);
            }
        }
    }
}
