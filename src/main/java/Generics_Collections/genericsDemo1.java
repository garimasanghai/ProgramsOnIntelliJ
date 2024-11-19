package Generics_Collections;

public class genericsDemo1 {
    public static void main(String[] args) {
        temp_sum(23,45);
        temp_sum("Pramod","Dutta");


    }

    public static Integer temp_sum(Integer a, Integer b){
        return  a+b;
    }

    public static String temp_sum(String a, String b){
        return  a+b;
    }
}
