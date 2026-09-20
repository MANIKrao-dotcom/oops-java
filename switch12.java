public class switch12 {
    public static void main(String[] args) {

        int country = 1;
        int state = 2;

        switch (country) {

            case 1:
                System.out.println("India");

                switch (state) {
                    case 1:
                        System.out.println("Karnataka");
                        break;

                    case 2:
                        System.out.println("Kerala");
                        break;

                    case 3:
                        System.out.println("Tamil Nadu");
                        break;

                    default:
                        System.out.println("Invalid State");
                }
                break;

            case 2:
                System.out.println("USA");
                break;

            default:
                System.out.println("Invalid Country");
        }
    }   
}
