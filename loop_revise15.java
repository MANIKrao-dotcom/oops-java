public class loop_revise15 {
     public static void main(String[] args) {

        String a = "JAVA";
        String b = "JUMP";

        for(int i = 0; i < a.length(); i++) {

            for(int j = 0; j < b.length(); j++) {

                if(a.charAt(i) == b.charAt(j)) {
                    System.out.println(a.charAt(i) + " is common");
                }
            }
        }
    }
}
