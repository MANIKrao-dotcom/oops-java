public class sum_of_numbers {
    public static void main(String[] args) {
        int n = 1234;

        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;

        int sum = a + b + c + d;

        System.out.println("Sum of digits = " + sum);
    

}
}


