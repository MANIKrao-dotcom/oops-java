public class loop10 {
       public static void main(String[] args) {

        for (int num = 1; num <= 1000; num++) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {

                int digit = temp % 10;
                int power = 1;

                for (int i = 1; i <= 3; i++) {
                    power = power * digit;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
