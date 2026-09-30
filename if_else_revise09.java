public class if_else_revise09 {
      public static void main(String[] args) {

        int cp1 = 1000;
        int sp1 = 1400;

        int cp2 = 2000;
        int sp2 = 2300;

        int profit1 = sp1 - cp1;
        int profit2 = sp2 - cp2;

        if (profit1 > 0) {

            if (profit2 > 0) {

                System.out.println("Both products have profit.");

                if (profit1 > profit2) {
                    System.out.println("Product 1 has more profit.");
                } else {
                    if (profit2 > profit1) {
                        System.out.println("Product 2 has more profit.");
                    } else {
                        System.out.println("Both have equal profit.");
                    }
                }

            } else {
                System.out.println("Product 1 has profit.");
                System.out.println("Product 2 has no profit.");
            }

        } else {

            if (profit2 > 0) {
                System.out.println("Product 2 has profit.");
                System.out.println("Product 1 has no profit.");
            } else {
                System.out.println("Neither product has profit.");
            }
        }
    }  
}
