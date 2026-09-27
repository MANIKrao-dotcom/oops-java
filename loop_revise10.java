public class loop_revise10 {
     public static void main(String[] args) {

        double[] investments = {10000, 20000, 50000};

        for (int i = 0; i < investments.length; i++) {

            double amount = investments[i];

            System.out.println("\nInitial Investment: ₹" + amount);

            for (int year = 1; year <= 5; year++) {

                for (int month = 1; month <= 12; month++) {

                    amount = amount + (amount * 0.01);
                }

                System.out.println("Year " + year +
                                   " = ₹" + amount);
            }
        }
    }  
}
