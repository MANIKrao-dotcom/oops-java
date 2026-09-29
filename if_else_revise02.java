public class if_else_revise02 {
      public static void main(String[] args) {

        int salary = 80000;

        if (salary >= 50000) {

            if (salary >= 100000) {
                System.out.println("Tax rate: 20%");
            } 
            else {
                System.out.println("Tax rate: 10%");
            }

        } 
        else {

            if (salary >= 30000) {
                System.out.println("Tax rate: 5%");
            } 
            else {
                System.out.println("No tax");
            }
        }
    }
}
