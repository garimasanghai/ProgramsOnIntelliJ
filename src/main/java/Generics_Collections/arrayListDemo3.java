package Generics_Collections;

import java.util.ArrayList;

public class arrayListDemo3 {
    public static void main(String[] args) {
        /*
        Problem with Arrays
        1. Size -> Fixed Size Problem in array.
        2. There are not in built functions available in the arrays.`
        3. sorting, updating, delete, increasing size, decrease size.`
        4. array can store one type of data type.
        */

       // EXAMPLE:
        // Integer [] arr = new Integer[10];
        // System.out.println(arr);
        // arr[0] = "PRAMOD";
        //-------------------------------------

        //Solution for ARRAY is ARRAYLIST :
        /*
        1. Dynamic Size
        2. Stores multiple data type
        3. Built-in Functions
        */
        // Collection list = new ArrayList(); // Dynamic Dispatch GrandFather ref child object
        // List list1 = new ArrayList(); // Dynamic Dispatch - Father ref child object

        ArrayList studentList = new ArrayList();
        studentList.add("Pramod");
        studentList.add("Dutta");
        studentList.add("Dutta"); // Duplicate is allowed.
        studentList.add("Anil");
        studentList.add("Amit");
        studentList.add(true); // Different data type is allowed.
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);
    }
}
