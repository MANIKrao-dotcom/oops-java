public class if_else_revise07 {
        public static void main(String[] args) {

        int cp = 5000;
        int sp = 5800;

        if (sp > cp) {
            int profit = sp - cp;

            if (profit > 1000) {
                System.out.println("Very High Profit");
            } else {
                if (profit >= 500) {
                    System.out.println("Good Profit");
                } else {
                    System.out.println("Small Profit");
                }
            }

            System.out.println("Profit = " + profit);

        } else {
            if (sp < cp) {
                int loss = cp - sp;

                if (loss > 1000) {
                    System.out.println("Very High Loss");
                } else {
                    if (loss >= 500) {
                        System.out.println("High Loss");
                    } else {
                        System.out.println("Small Loss");
                    }
                }

                System.out.println("Loss = " + loss);

            } else {
                System.out.println("No Profit No Loss");
            }
        }
    }
}
