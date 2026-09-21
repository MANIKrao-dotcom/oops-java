class Calculator {

    void add() {
        int a = 10;
        int b = 20;
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
    }
}