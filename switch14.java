public class switch14 {
     public static void main(String[] args) {

        int choice = 1;
        int operation = 2;

        switch (choice) {

            case 1:
                System.out.println("Basic Calculator");

                switch (operation) {
                    case 1:
                        System.out.println("Addition");
                        break;

                    case 2:
                        System.out.println("Subtraction");
                        break;

                    case 3:
                        System.out.println("Multiplication");
                        break;

                    case 4:
                        System.out.println("Division");
                        break;

                    default:
                        System.out.println("Invalid Operation");
                }
                break;

            case 2:
                System.out.println("Scientific Calculator");

                switch (operation) {
                    case 1:
                        System.out.println("Square");
                        break;

                    case 2:
                        System.out.println("Cube");
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
