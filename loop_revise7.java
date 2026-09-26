public class loop_revise7 {
       public static void main(String[] args) {

        for(int i = 1; i <= 1000; i++) {

            int n = i;
            int sum = 0;

            while(n > 0) {

                int digit = n % 10;
                sum = sum + (digit * digit * digit);
                n = n / 10;
            }

            if(sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
