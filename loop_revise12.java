public class loop_revise12 {
     public static void main(String[] args) {

        String str = "JAVA";

        for(int i = 0; i < str.length(); i++) {

            for(int j = 0; j < str.length(); j++) {
                System.out.println(str.charAt(i) + " " + str.charAt(j));
            }

            System.out.println();
        }
    }
}
