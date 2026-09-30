public  class if_else_revise06{
     public static void main(String[] args) {

        int cp = 2000;
        int sp = 2500;

        if (sp > cp) {
            int profit = sp - cp;
            double percentage = (profit * 100.0) / cp;

            System.out.println("Profit = " + profit);
            System.out.println("Profit Percentage = " + percentage + "%");

            if (percentage >= 20) {
                System.out.println("Good Profit");
            } else {
                System.out.println("Small Profit");
            }

        } else {
            if (sp < cp) {
                int loss = cp - sp;
                double percentage = (loss * 100.0) / cp;

                System.out.println("Loss = " + loss);
                System.out.println("Loss Percentage = " + percentage + "%");

                if (percentage >= 20) {
                    System.out.println("High Loss");
                } else {
                    System.out.println("Small Loss");
                }
            } else {
                System.out.println("No Profit No Loss");
            }
        }
    }
}