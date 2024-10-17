package ATBOct2024;

public class lab_024operator {
    public static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        // PramodDutta1010 - first operator - + performed as Concatination
        System.out.println(a + b + first_name + last_name);
        // First + math -> 20PramodDutta

        System.out.println(first_name + last_name + (a + b));
        // BODMAS -

        int c = 10;
        int d = 20;
        System.out.println(a+b); // Mathimatics Sum

        String name1 = "Praamod";
        String name2 = "Duttaa";
        System.out.println(name1+name2); // concatination

        // + -> behave differently with the data type.
        // + -> operator overloading


    }
}
