package Generics_Collections;

public class gerics_SolutionDemo2 {
    public static void main(String[] args) {
        temp_sum(23, 45);
        temp_sum("Pramod", "Dutta");
        temp_sum(true, false);
        // pramod -> any data Type.

    }

    //Instead of T u can take any variable name, basically it can accept any datatype
    public static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
