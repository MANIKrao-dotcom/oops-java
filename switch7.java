public class switch7 {
     public static void main(String[] args) {

        int choice = 1;
        int a = 20;
        int b = 5;

        switch (choice) {

            case 1:
                int operation = 3;

                switch (operation) {
                    case 1:
                        System.out.println(a + b);
                        break;

                    case 2:
                        System.out.println(a - b);
                        break;

                    case 3:
                        System.out.println(a * b);
                        break;

                    case 4:
                        System.out.println(a / b);
                        break;

                    default:
                        System.out.println("Invalid Operation");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
