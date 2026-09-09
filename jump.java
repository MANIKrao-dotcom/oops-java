public class jump {
    public static void main(String[] args) {

        int x = 10;

        while (x <= 100) {
           

            System.out.println("The num is " + x);

            x = x + 10;

            if (x == 30) {
                continue;
            
            }
        }
    }
}