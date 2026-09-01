class Divisible
{
    public static void main(String[] args)
    {
        int n = 22;

        if(n % 13 == 0 ){
            System.out.println("22 is divisible by both 13 ");
        }
        else if(n %17 ==0){
            System.out.println("22 is divisible by 17");
        }

        else
            System.out.println("22 is not divisible by both 13 or 17");
    }
}
