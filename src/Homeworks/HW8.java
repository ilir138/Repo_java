package Homeworks;

import java.util.ArrayList;
import java.util.List;

public class HW8 {

    public static void main(String[] args) {
    List<String> newWords = new ArrayList<>();
    newWords.add("happy");
    newWords.add("peace");
    newWords.add("joy");
    newWords.add("grow");
    newWords.add("laugh");
    newWords.add("happy");
    newWords.add("laugh");
    newWords.add("joy");

        System.out.println("Words that are duplicate in the array are: " + duplicates(newWords));



        int[] arr1 = {11, 32, 43, 54, 65};
        int[] arr2 = {76, 11, 89, 43, 87, 23, 32};

       System.out.println("Common elements: " + commonElements(arr1,arr2));

    }

/**
 * Create a method, that will return all duplicates values in the given String array.
 * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
 * Result -> ["happy", "joy", "laugh"]
 */


    public static List<String> duplicates (List<String>words){

    List<String>words2=new ArrayList<>();
    for (String word:words){
        if (words.indexOf(word) != words.lastIndexOf(word)) {
            if (!words2.contains(word)) {
                words2.add(word);
            }
        }
    }
    return words2;
    }


/* Create a method, that will return the common elements/value in two given int-array
 * int[] arr1 = {11, 32, 43, 54, 65}
 * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
 * Result -> [11, 32, 43]
 *
 */
    public static List<Integer>commonElements(int[]arr1, int[]arr2) {

    List<Integer> common = new ArrayList<Integer>();

    for(int i =0; i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i] == arr2[j]){
                if(!common.contains(arr1[i])){
                    common.add(arr1[i]);
                }
            }
        }
    }
    return common;
    }
}
