public class loop_revise8 {
      public static void main(String[] args) {

        String[] people = {"Manu", "Rahul", "Arun"};

        int[][] expenses = {
            {5000, 3000, 2000},
            {4000, 2500, 3500},
            {6000, 2000, 1500}
        };

        for (int i = 0; i < people.length; i++) {

            int total = 0;

            System.out.println("\nExpenses of " + people[i]);

            for (int j = 0; j < expenses[i].length; j++) {
                System.out.println("Month " + (j + 1) + ": ₹" + expenses[i][j]);
                total = total + expenses[i][j];
            }

            System.out.println("Total Expense = ₹" + total);
        }
    }
}
