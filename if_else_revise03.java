public class if_else_revise03 {
     public static void main(String[] args) {

        int salary = 60000;
        int creditScore = 750;

        if (salary >= 40000) {

            if (creditScore >= 750) {

                if (salary >= 70000) {
                    System.out.println("Credit Limit: Rs. 2,00,000");
                } 
                else {
                    System.out.println("Credit Limit: Rs. 1,00,000");
                }

            } 
            else {
                System.out.println("Credit Limit: Rs. 50,000");
            }

        } 
        else {
            System.out.println("Credit card not approved");
        }
    } 
}
