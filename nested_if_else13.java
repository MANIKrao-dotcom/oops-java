public class nested_if_else13 {
      public static void main(String[] args) {

        int a = 45;
        int b = 78;
        int c = 62;

        if (a > b) {

            if (a > c) {
                System.out.println("A is largest");
            } else {
                System.out.println("C is largest");
            }

        } else {

            if (b > c) {
                System.out.println("B is largest");
            } else {
                System.out.println("C is largest");
            }
        }
    }
    
}
