class Student1 {
    String name = "Manik";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.display();
    }
}