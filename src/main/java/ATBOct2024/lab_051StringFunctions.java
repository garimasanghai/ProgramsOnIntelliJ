package ATBOct2024;

public class lab_051StringFunctions {
    public static void main(String[] args) {

        //substring
        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome);
        String roar = anotherPalindrome.substring(11, 15); //last will always give the value by -1
        System.out.println(roar);
        System.out.println("SUBSTRING- Extracts a portion of the string");
        System.out.println(" --------------------");
        // substring - many interviews

        //concat
        String s1 = "Pramod";
        String s2 = s1.concat("Dutta");
        System.out.println(s2);
        System.out.println("CONCAT- Combines two strings.");
        System.out.println(" --------------------");

        //split
        String fruits = "apple,banana,cherry"; // delimter = ,
        System.out.println(fruits);
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        System.out.println(fruits2);
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);
        System.out.println("SPLIT- Splitting string into an array of substrings based on delimeter ie ,");
        System.out.println(" --------------------");

        //charAt
        String s4 = "Pramod";
        System.out.println(s4);
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException
        System.out.println("CharAt- Returns the char value at the specified index");
        System.out.println(" --------------------");

        //trim
        String s5 = " Pramod ";
        System.out.println(s5);
        System.out.println(s5.trim());
        System.out.println("TRIM- Returns string with the same value by removing all leading & trailing space");
        System.out.println(" --------------------");

        //indexOf
        String s6 = "Pramod";
        System.out.println(s6);
        System.out.println(s6.indexOf("r"));
        System.out.println(s6.indexOf("d"));
        System.out.println("IndexOf- Returns the index of first occurrence of the specified substring");
        System.out.println(" --------------------");

        //lastIndexOf
        String s8 = "Pramoddutta";
        System.out.println(s8);
        System.out.println(s8.lastIndexOf("d"));
        System.out.println("LastIndexOf- Returns the index of the last occurrence of the specified substring");
        System.out.println(" --------------------");

        //contains
        String s7 = "Pramod";
        System.out.println(s7);
        //returns boolean as output
        System.out.println(s7.contains("ra"));
        System.out.println(s7.contains("zy"));
        System.out.println("CONTAINS- Returns true only if this string contains the specified sequence of char values");
        System.out.println(" --------------------");


        //replace
        String s9 = "Pramoddutta";
        System.out.println(s9);
        System.out.println(s9.replace("d", "z"));
        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);
        System.out.println(s9.replaceAll("d", "z"));
        System.out.println("This is REPLACE");
        System.out.println(" --------------------");

        //replaceAll
        String original1 = "Hello123 World456!";
        System.out.println(original1);
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);
        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);
        System.out.println("This is ReplaceAll");
        System.out.println(" --------------------");

        //startsWith
        String s10 = "Pramodduttaji";
        System.out.println(s10);
        // will check the condition & return boolean as output
        System.out.println(s10.startsWith("Pra"));
        System.out.println("This is StartsWith");
        System.out.println(" --------------------");

        //endsWith
        String s11 = "Pramodduttaji";
        System.out.println(s11);
        // will check the condition & return boolean as output
        System.out.println(s10.endsWith("ji"));
        System.out.println(s10.endsWith("zy"));
        System.out.println("This is EndsWith");
        System.out.println(" --------------------");


    }
}
