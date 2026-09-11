public class nestedd_if_else3 { 
      public static void main(String[] args) {

        int a = 20;
        int b = 10;

        if (a > b) {

            if (a > 0) {
                System.out.println("A is largest and positive");
            } else {
                System.out.println("A is largest but negative");
            }

        } else {

            if (b > 0) {
                System.out.println("B is largest and positive");
            } else {
                System.out.println("B is largest but negative");
            }
        }
    }
    
}
