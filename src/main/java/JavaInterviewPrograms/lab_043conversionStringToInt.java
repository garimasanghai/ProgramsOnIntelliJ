package JavaInterviewPrograms;

public class lab_043conversionStringToInt {
    public static void main(String[] args) {
        String arg_age_string = args[0];
        // String -> Int
        int age = Integer.parseInt(arg_age_string); //This is the method used---> parseInt
        //System.out.println(age);

        while (age > 0) {
            System.out.println(age);
            age--;
        }

    }
}
