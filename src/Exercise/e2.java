package Exercise;

import java.util.Arrays;

public class e2 {
    public static void main(String[] args) {
          int[] numbers1 = {11, 32, 43, 12, 32, 54, 11, 54, 65, 32};
          int findPresenceOf = 32;
        System.out.println(presentInArray(findPresenceOf,numbers1));;

       numberOfVowels("HaPPy World");

        int[]numbers = {11,22,33,44,56};
        int minimumValue = smallest(numbers);
        System.out.println("smallest number in this array is: " + minimumValue);
        //double average = avgr(numbers);
       // System.out.println("average num in this array is: " + average);
        String middles = middle("evaso");
        System.out.println("middle value: " + middles);

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

    public static int smallest (int[] small){
    int minNum = small[0];
    for (int i=0;i<small.length;i++){
        if (small[i] < minNum){
            minNum = small[i];
        }
    }
    return minNum;
    }

    public double avgr (int[]num){
        double average = 0;
     for (double nums : num){
         average = nums + average / num.length;
        }
        System.out.println("average nr of the arr is: " + average);
        return average;
    }

    public static String middle (String str){
        int position;
        int length;
        if (str.length() %2==0) {
            position = str.length() / 2 - 1;
            length = 2;
        }else{
            position = str.length() / 2;
            length =1;
        }

           return str.substring(position, position + length);


    }
}
