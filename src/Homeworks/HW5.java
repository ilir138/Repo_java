package Homeworks;

import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {
        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};


        position("philip",names);

        int[]numbers = {11,22,33,44,56};
        double numbersTotal = arrayTotal(numbers);

        System.out.println("Average of the given array: " + numbersTotal);

        int[] numbers2 = {199, 22, 11, 65, 189, 91, 100, 81};
        int numbersMax = getMaxValue(numbers2);
        System.out.println("Maximum value in the given array: " + numbersMax);

        int[] scores = {90, 89, 191, 100, 81};
        String[] names3 = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};



    }


    public static int position (String nameToSearch, String[] array){

        int index = 0;
        for (int i =0; i<array.length;i++){
            if (array[i]==nameToSearch){
                index=i+1;
                break;
            }
        }
        if (index>0){
            System.out.println("The position of "+nameToSearch+" is: "+index);
        }else {
            System.out.println(nameToSearch + " is not present in the array.");
        }
        return index;

    }
    public static  double arrayTotal(int[] array){

        double total = 0;
        for (double value : array){
            total = total + value / array.length;


        }
        return total;
    }
    public static int getMaxValue(int[] numbers) {
        int maxValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
   /* public static int getMaxValue(int[]scores,String[]names2) {


        *//*String highestName = "";
        int highestScore =0;



            if (scores[i]>highestScore){
                highestName=names2[i];
                highestScore=scores[i];
            }


        return highestScore;
*//*

    }*/
}
