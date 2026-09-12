public class nested_if_else7 {
     public static void main(String[] args) {

        int age = 65;

        if (age >= 18) {

            if (age >= 60) {
                System.out.println("Eligible to vote and Senior Citizen");
            } else {
                System.out.println("Eligible to vote");
            }

        } else {
            System.out.println("Not eligible to vote");
        }
    }   
}
