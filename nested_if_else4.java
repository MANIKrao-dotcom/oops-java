public class nested_if_else4 {  
      public static void main(String[] args) {

        int marks = 75;

        if (marks >= 40) {

            if (marks >= 60) {
                System.out.println("Pass with First Class");
            } else {
                System.out.println("Pass");
            }

        } else {
            System.out.println("Fail");
        }
    }
    
}
