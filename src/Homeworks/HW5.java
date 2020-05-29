package Homeworks;

import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {
        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "philip";
        System.out.println(position(names,nameToSearch));


        int[]numbers = {11,22,33,44,56};
        double numbersTotal = arrayTotal(numbers);

        System.out.println("Average of the given array: " + numbersTotal);

        int[] numbers2 = {199, 22, 11, 65, 189, 91, 100, 81};
        int numbersMax = maxValue(numbers2);
        System.out.println("Maximum value in the given array: " + numbersMax);

        int[] scores = {90, 89, 191, 100, 81};
        String[] students = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        System.out.println(getMaxValue(scores,students));

    }


    public static String position (String[] array,String nameToSearch){
        int index = 0;
        String positionString="";
        for (int i =0; i<array.length;i++){
            if (array[i].equalsIgnoreCase(nameToSearch)){
                index=i+1;
                break;
            }
        }
        if (index>0){
            positionString = nameToSearch + " is on position: " + index;
        }else {
            positionString = nameToSearch + " is not present in the array.";
        }
        return positionString;

    }
    public static  double arrayTotal(int[] array){

        double total = 0;
        for (double value : array){
            total = total + value / array.length;


        }
        return total;
    }
    public static int maxValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
    public static String getMaxValue(int[]scores,String[]names2) {
            int maxValue = scores[0];
            int maxScore = 0;
            String topStudent = "";
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] > maxValue) {
                    maxValue = scores[i];
                    maxScore = i;
                }
            }
            topStudent = names2[maxScore] + " scored maximum score (" + maxValue + ")";
            return topStudent;

    }
}
