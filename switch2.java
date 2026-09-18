public class switch2 {
      public static void main(String[] args) {

        int num = 17;

        switch (num % 2) {
            case 0:
                System.out.println("Even");
                break;

            case 1:
                System.out.println("Odd");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
