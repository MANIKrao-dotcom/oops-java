class Student3 {

    void display(String name, int marks) {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student3 s = new Student3();

        s.display("Rahul", 85);
        s.display("Amit", 72);
    }
}