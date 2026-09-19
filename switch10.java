public class switch10 {
       public static void main(String[] args) {

        int department = 2;
        int year = 2;
        int subject = 3;

        switch (department) {

            case 1:
                System.out.println("Computer Science");

                switch (year) {
                    case 1:
                        System.out.println("First Year");
                        break;

                    case 2:
                        System.out.println("Second Year");

                        switch (subject) {
                            case 1:
                                System.out.println("Java");
                                break;

                            case 2:
                                System.out.println("Python");
                                break;

                            case 3:
                                System.out.println("Data Structures");
                                break;

                            default:
                                System.out.println("Invalid Subject");
                        }
                        break;

                    default:
                        System.out.println("Invalid Year");
                }
                break;

            case 2:
                System.out.println("Information Science");

                switch (year) {
                    case 1:
                        System.out.println("First Year");
                        break;

                    case 2:
                        System.out.println("Second Year");

                        switch (subject) {
                            case 1:
                                System.out.println("Java");
                                break;

                            case 2:
                                System.out.println("DBMS");
                                break;

                            case 3:
                                System.out.println("Computer Networks");
                                break;

                            default:
                                System.out.println("Invalid Subject");
                        }
                        break;

                    default:
                        System.out.println("Invalid Year");
                }
                break;

            default:
                System.out.println("Invalid Department");
        }
    }
}
