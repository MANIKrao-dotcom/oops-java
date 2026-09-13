public class nested_if_else12 {
        public static void main(String[] args) {

        String username = "admin";
        String password = "1234";

        String enteredUsername = "admin";
        String enteredPassword = "1234";

        if (enteredUsername.equals(username)) {

            if (enteredPassword.equals(password)) {

                System.out.println("Login Successful");

                int role = 2;

                if (role == 1) {
                    System.out.println("Admin Access");
                } else if (role == 2) {
                    System.out.println("User Access");
                } else {
                    System.out.println("Unknown Role");
                }

            } else {
                System.out.println("Wrong Password");
            }

        } else {
            System.out.println("Wrong Username");
        }
    }
    
}
