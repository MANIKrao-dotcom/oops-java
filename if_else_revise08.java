public class if_else_revise08{
        public static void main(String[] args) {

        int costPrice = 3000;
        int markedPrice = 4000;
        int discount = 500;

        int sellingPrice = markedPrice - discount;

        if (sellingPrice > costPrice) {

            int profit = sellingPrice - costPrice;
            System.out.println("Selling Price = " + sellingPrice);
            System.out.println("Profit = " + profit);

            if (profit >= 500) {
                System.out.println("Even after discount, there is good profit.");
            } else {
                System.out.println("Profit is very small.");
            }

        } else {

            if (sellingPrice < costPrice) {

                int loss = costPrice - sellingPrice;
                System.out.println("Selling Price = " + sellingPrice);
                System.out.println("Loss = " + loss);

                if (loss >= 500) {
                    System.out.println("High Loss due to discount.");
                } else {
                    System.out.println("Small Loss.");
                }

            } else {
                System.out.println("No Profit No Loss.");
            }
        }
    }
}