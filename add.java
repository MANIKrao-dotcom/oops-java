class add{
    public int addNumber(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] aggs){
        int num1 = 10;
        int num2 = 20;

        add obj = new add();
        int result = obj.addNumber(num1, num2);
        System.out.println("sum is " + result);
    }
}