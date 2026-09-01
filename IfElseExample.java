class AgeCategory {
    public static void main(String[] args) {

        int age = 25;

        if (age <= 13)
            System.out.println("child");
        else if (age <= 18)
            System.out.println("teen");
        else if (age <= 40)
            System.out.println("major");
        else if (age <= 60)
            System.out.println("matured");
        else if (age > 60)
            System.out.println("seniour citizen");
        else
            System.out.println("baby");
    }
}