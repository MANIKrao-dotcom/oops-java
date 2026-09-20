public class switch15 {
     public static void main(String[] args) {

        int department = 1;
        int year = 2;

        switch (department) {

            case 1:
                System.out.println("Computer Science");

                switch (year) {
                    case 1:
                        System.out.println("First Year");
                        break;

                    case 2:
                        System.out.println("Second Year");
                        break;

                    case 3:
                        System.out.println("Third Year");
                        break;

                    default:
                        System.out.println("Invalid Year");
                }
                break;

            case 2:
                System.out.println("Mechanical");

                switch (year) {
                    case 1:
                        System.out.println("First Year");
                        break;

                    case 2:
                        System.out.println("Second Year");
                        break;

                    default:
                        System.out.println("Invalid Year");
                }
                break;

            default:
                System.out.println("Invalid Department");
        }
    }
}
