public class nested_if_else9 {
        public static void main(String[] args) {

        int marks = 85;
        int attendance = 90;

        if (marks >= 40) {

            if (attendance >= 75) {

                if (marks >= 90) {
                    System.out.println("Grade A+");
                } else if (marks >= 80) {
                    System.out.println("Grade A");
                } else if (marks >= 70) {
                    System.out.println("Grade B");
                } else {
                    System.out.println("Grade C");
                }

                if (marks >= 85 && attendance >= 85) {
                    System.out.println("Eligible for Scholarship");
                } else {
                    System.out.println("Not eligible for Scholarship");
                }

            } else {
                System.out.println("Failed due to low attendance");
            }

        } else {
            System.out.println("Failed in examination");
        }
    }

    
}
