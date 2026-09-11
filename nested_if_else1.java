public class nested_if_else1 {
     public static void main(String[] args) {

        int num = 10;

        if (num >= 0) {

            if (num % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }

        } else {

            if (num % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        }
    }
    
}
