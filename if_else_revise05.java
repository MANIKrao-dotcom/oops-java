public class if_else_revise05{
       public static void main(String[] args) {

        int costPrice = 1000;
        int sellingPrice = 1250;

        if (sellingPrice > costPrice) {

            int profit = sellingPrice - costPrice;
            System.out.println("There is a Profit.");
            System.out.println("Profit = " + profit);

            if (profit >= 500) {
                System.out.println("It is a High Profit.");
            } 
            else {
                System.out.println("It is a Normal Profit.");
            }

        } 
        else {

            if (sellingPrice < costPrice) {

                int loss = costPrice - sellingPrice;
                System.out.println("There is a Loss.");
                System.out.println("Loss = " + loss);

                if (loss >= 500) {
                    System.out.println("It is a High Loss.");
                } 
                else {
                    System.out.println("It is a Normal Loss.");
                }
            } 
            else {
                System.out.println("There is No Profit and No Loss.");
            }
        }
    }
}