package JavaInterviewPrograms;

public class lab_052StringFuntionspractice {
    public static void main(String[] args) {

        //.substring
        String s1 = "Wow!Mom";
        System.out.println(s1);
        String extract = s1.substring(3, 7); //last will always give the value by -1
        System.out.println(extract);
        System.out.println(".substring- Extracts a portion of the string");
        System.out.println(" --------------------");

        //String + String
        String s2= "Testing";
        String s3 = s2 + "Academy";
        System.out.println(s3);
        System.out.println("CONCAT- Combines two strings.");
        System.out.println(" --------------------");

        //.split
        String s4Days = "Mon,Tue,Wed,Thurs,Fri,Sat,Sun";
        System.out.println(s4Days);
        String[] split_s4Days = s4Days.split(",");
        System.out.println(split_s4Days [2]); //Value of index is printed
        System.out.println(split_s4Days[0]);
        System.out.println(split_s4Days[5]);
        System.out.println(".split- Splitting string into an array of substrings based on delimeter ie ,");
        System.out.println(" --------------------");

        //.charAt
        String s5 = "Quality Assurance";
        System.out.println(s5);
        System.out.println(s5.charAt(4));
        System.out.println(".charAt- Returns the char value at the specified index");
        System.out.println(" --------------------");

        //.trim
        String s6 = " QA is my Bread & Butter ";
        System.out.println(s6);
        System.out.println(s6.trim());
        System.out.println(".trim- Returns string with the same value by removing all leading & trailing space");
        System.out.println(" --------------------");

        //.indexOf
        String s7 = "Testing Academy";
        System.out.println(s7);
        System.out.println("The index of s in Testing Academy is: " + s7.indexOf("s"));
        System.out.println(".indexOf- Returns the index of first occurrence of the specified substring");
        System.out.println(" --------------------");

        //lastIndexOf
        String s8 = "Automation";
        System.out.println(s8);
        //it will take indexing of last used char
        System.out.println("The last index of t in Automation is: " +s8.lastIndexOf("t"));
        System.out.println(".lastIndexOf- Returns the index of the last occurrence of the specified substring");
        System.out.println(" --------------------");

        //contains
        String s9 = "Testing";
        System.out.println(s9);
        System.out.println(s9.contains("u"));
        System.out.println(".contains- Returns true only if this string contains the specified sequence of char values");
        System.out.println(" --------------------");

        //replace
        String s10 = "Java";
        System.out.println(s10);
        System.out.println(s10.replace("a", "i"));
        System.out.println(".replace- It replaces the specific char");
        System.out.println(" --------------------");

        //replaceAll
        String s11 = "Python";
        System.out.println(s11);
        System.out.println(s11.replaceAll("Python", "Selenium Java"));
        System.out.println(" ");
        String s12 = "2010Garima1988 Garg";
        System.out.println(s12);
        System.out.println(s12.replaceAll("\\d+", " "));
        System.out.println(".replaceAll- It replaces the word");
        System.out.println(" --------------------");

        //startsWith
        String s13 = "Selenium Java";
        System.out.println(s13);
        // will check the condition & return boolean as output
        System.out.println(s13.startsWith("joo"));
        System.out.println(".startsWith- Checks the condition & returns the value as boolean");
        System.out.println(" --------------------");

        //endsWith
        String s14 = "Working in IntelliJ";
        System.out.println(s14);
        System.out.println(s14.endsWith("IntelliJ"));
        System.out.println(".endsWith- Checks the condition & returns the value as boolean");
        System.out.println(" --------------------");

        //.length
        String s15 = "Selenium with Java";
        System.out.println(s15);
        System.out.println(s15.length());
        System.out.println(".length- Returns the length of the String");
        System.out.println(" --------------------");

        //toLowerCase-toUpperCase-isEmpty-isBlank
        String s16 = "Selenium with Python";
        System.out.println(s16);
        System.out.println(s16.toLowerCase());
        System.out.println("Changes String to lower Case");
        System.out.println(s16.toUpperCase());
        System.out.println("Changes String to upper Case");
        System.out.println(s16.isEmpty());
        System.out.println(".isEmpty- Checks the condition & returns the value as boolean");
        System.out.println(s16.isBlank());
        System.out.println(".isBlank- Checks the condition & returns the value as boolean");
    }
}
