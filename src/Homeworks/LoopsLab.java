package Homeworks;

public class LoopsLab {
    public static void main(String[] args) {
        /*String[] names = {"happy", "peace", "laugh", "love", "grow", "learn"};
        // take values from names-array, print only odd index values (1,3,5...)

        for (int i =1;i < names.length; i ++) {
            System.out.println(names);

        }*/
       // String[] words = {"happy", "peace", "laugh", "love", "grow", "learn", "happy", "laungh", "loved"};
        // print only duplicate words from words-array



      /*  String [] allWords = {"happy", "peace", "laugh", "love", "grow", "give", "laugh", "love", "loved" , "happy", "happy", "peace", "learn", "happy", "laugh", "loved"};
        // how many times each word appears in the given array.
        for (int i = 0; i<allWords.length; i++){
            for (int j=i+1;j<allWords.length; i++){
                if (allWords[i].toLowerCase().contains(allWords[j])){
                    System.out.println(allWords);
                }
            }
        }*/
        //int[] numbers = {121, 32, 43, 54, 64, 11, 81, 91, 23, 73};
        // find the first number which is a perfect square. [1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, ...]
        // display the number.


        String[] names = {"happy", "peace", "laugh", "love", "grow", "learn"};



        for (int i = 0;i<names.length; i++){
            System.out.println("Name: "+ names[i]);

        }
        for (int i = 0;i<names.length; i++){
            if (names[i].length()>=5){
                System.out.println(names[i].substring(0,1).toUpperCase() + names[i].substring(1).toLowerCase());
            }
        }
        for (int i = 0;i<names.length; i++) {
            System.out.println("Name: " + names[i]);
        }










    }
}
