package ATBOct2024;

public class lab_050String {
    public static void main(String[] args) {

       /* EXPLAIN the code:

       String name = "pramod";
        name = "dutta";
        name = "pramoddutta";
        name = "pramod"; // SCP

         String -> data type
         name -> Ref
         = -> assignment operator
         "Pramod" - Literal(String)
        ---------------------------------------
        Example:
        String s1 = "Hello"; // String Constant Pool
        String s4 = "Hello"; // SCP
        String s10 = "Hello"; // SCP
        //if the content is same, the variable will just point to it

        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello"); //OA
        String s5 = new String("hello");
        //everytime a new object will be created
        */

        String s1 = "Hello"; // SCP
        String s4 = "Hello"; // SCP
        String s2 = new String("Hello"); // Object Area
        String s3 = new String("Hello"); // Object Area
        String s5 = new String("hello"); // Object Area

        // 1 SCP , 3 OA
        // == -. comparison
        // ==  This is checking the ref locations

        System.out.println(s1 == s3); // false
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1 == s4); // true - SCP- -> Hello
        System.out.println(s3 == s5);

        // equals ( content) -> value
        // How can I check the values? equals == value

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
