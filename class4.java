class Student4 {
    int marks = 75;

    void check() {
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Student4 s = new Student4();
        s.check();
    }
}