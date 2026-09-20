public class switch13 {
     public static void main(String[] args) {

        int category = 2;
        int item = 3;

        switch (category) {

            case 1:
                System.out.println("Pizza");

                switch (item) {
                    case 1:
                        System.out.println("Cheese Pizza - ₹150");
                        break;

                    case 2:
                        System.out.println("Farmhouse Pizza - ₹200");
                        break;

                    default:
                        System.out.println("Invalid Pizza");
                }
                break;

            case 2:
                System.out.println("Burger");

                switch (item) {
                    case 1:
                        System.out.println("Veg Burger - ₹80");
                        break;

                    case 2:
                        System.out.println("Cheese Burger - ₹100");
                        break;

                    case 3:
                        System.out.println("Chicken Burger - ₹130");
                        break;

                    default:
                        System.out.println("Invalid Burger");
                }
                break;

            default:
                System.out.println("Invalid Category");
        }
    }
}
