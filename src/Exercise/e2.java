package Exercise;

import java.util.Arrays;

public class e2 {
    public static void main(String[] args) {
          int[] numbers1 = {11, 32, 43, 12, 32, 54, 11, 54, 65, 32};
          int findPresenceOf = 32;
        System.out.println(presentInArray(findPresenceOf,numbers1));;

       numberOfVowels("HaPPy World");

    }
    public static String presentInArray(int numberToFind,int[] numbers){
        int count=0;
        String result = "";
        for (int i=0;i<numbers.length;i++){
           if (numbers[i]==numberToFind){
               count++;
           }
        }if (count>0){
        result = numberToFind + " is present " + count + " times in " + Arrays.toString(numbers);
    }else {
            result = numberToFind + " is not present in " + Arrays.toString(numbers);
        }
        return result;
        }




     /* Find the number of vowels(a, e, i, o, u) in a given word/sentence?
            */
    public static int numberOfVowels (String sentence){
        int count =0;
        char[] vowels = {'a','e','i','o','u'};
        for (int i=0;i<sentence.length();i++) {
            char ch = sentence.toLowerCase().charAt(i);
            for (char vowel:vowels){
                if (vowel == ch)
                    count++;
            }

        } System.out.println("Numbers of vowels in the sentence is: " + count);
        return count;



    }

}
