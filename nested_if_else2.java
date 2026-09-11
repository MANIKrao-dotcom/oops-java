public class nested_if_else2 {  
      public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {

            if (age <= 100) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Invalid age");
            }

        } else {
            System.out.println("Not eligible to vote");
        }
    }
    
}
