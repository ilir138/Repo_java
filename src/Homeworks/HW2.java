package Homeworks;

import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {

        String firstName = "Ilir";



        int firstNameLength = firstName.length();
        System.out.println("Length of " + firstName + " is: " + firstNameLength);


        System.out.println("Does " + firstName + " starts with K: " + firstName.toUpperCase().startsWith("K"));

        char firstAlphabet = firstName.charAt(0);
        System.out.println("First alphabet of my name: " + firstAlphabet);


        System.out.println("Does " + firstName + " ends with M: " + firstName.toUpperCase().endsWith("M"));



        String myStatement = "I am a good programmer";

        String [] words = myStatement.split(" ");
        int lastIndex = words.length-1;
        System.out.println("Last word of the sentence: " + words[lastIndex]);

        String myStatement1 = "I am a good programmer";
        String[] split = myStatement1.split(" ");
        int afterSplit = split.length;
        System.out.println("Total number of words in my statement is: " + afterSplit);


        String myStatement2 = "I am a good programmer";

        String afterReplace = myStatement2.replace("r","f");
        System.out.println(afterReplace);

        String myName = " Ilir";

        String[] myNameLetter = myName.split("");
        System.out.println(myName + " length is: " + myNameLetter.length);






















    }
}