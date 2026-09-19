public class switch9 {
     public static void main(String[] args) {

        int course = 2;
        int semester = 3;
        int marks = 75;

        switch (course) {

            case 1:
                System.out.println("BCA");

                switch (semester) {
                    case 1:
                        System.out.println("Semester 1");
                        break;

                    case 2:
                        System.out.println("Semester 2");
                        break;

                    default:
                        System.out.println("Invalid Semester");
                }
                break;

            case 2:
                System.out.println("B.Tech");

                switch (semester) {
                    case 1:
                        System.out.println("Semester 1");
                        break;

                    case 2:
                        System.out.println("Semester 2");
                        break;

                    case 3:
                        System.out.println("Semester 3");

                        if (marks >= 40) {
                            System.out.println("Pass");
                        } else {
                            System.out.println("Fail");
                        }
                        break;

                    default:
                        System.out.println("Invalid Semester");
                }
                break;

            default:
                System.out.println("Invalid Course");
        }
    }
}
