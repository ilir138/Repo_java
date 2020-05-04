package Homeworks;

import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {

        String firstName = "Ilir";
        String firstName2 = "ilir";


        int firstNameLength = firstName.length();
        System.out.println("Length of " + firstName + " is: " + firstNameLength);

        boolean doesStartK = firstName.startsWith("K");
        System.out.println("Does " + firstName + " starts with K: " + doesStartK);

        char firstAlphabet = firstName.charAt(0);
        System.out.println("First alphabet of my name: " + firstAlphabet);

        boolean doesEnd = firstName.toUpperCase().endsWith("M") && firstName.equalsIgnoreCase(firstName2) ;

        System.out.println("Does " + firstName + " ends with M: " + doesEnd);



        String myStatement = "I am a good programmer";

        String [] words = myStatement.split(" ");
        myStatement = words[4];
        System.out.println("Last word of the sentence: " + myStatement);

        String myStatement1 = "I am a good programmer";
        String[] split = myStatement1.split(" ");
        int afterSplit = split.length;
        System.out.println("Total number of words in my statement is: " + afterSplit);


        String myStatement2 = "I am a good programmer";

        String afterReplace = myStatement2.replace("r","f");
        System.out.println(afterReplace);

        String myName = " Ilir";


        int calculate = myName.indexOf("r");

        System.out.println("Number of words in my name is: "+ calculate);






















    }
}