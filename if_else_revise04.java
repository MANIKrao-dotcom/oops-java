public class if_else_revise04 {
      public static void main(String[] args) {

        int age = 25;
        int income = 60000;
        int risk = 8;

        if (age < 40) {

            if (income >= 50000) {

                if (risk >= 7) {
                    System.out.println("High Risk Investment");
                } 
                else {
                    System.out.println("Moderate Risk Investment");
                }

            } 
            else {
                System.out.println("Low investment amount recommended");
            }

        } 
        else {

            if (risk >= 5) {
                System.out.println("Moderate Risk Investment");
            } 
            else {
                System.out.println("Low Risk Investment");
            }
        }
    }
}
