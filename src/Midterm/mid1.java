package Midterm;

import java.sql.SQLOutput;
import java.util.Arrays;

public class mid1 {
    public static void main(String[] args) {

    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */
    int[] originalArray = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
    int removeIndex = 3;

        System.out.println("Original array:" + Arrays.toString(originalArray));

    int[] removeValue1 = removeValue(originalArray,removeIndex);

        System.out.println("Result: " + Arrays.toString(removeValue1));

    int[] array = {0, 5, -1, 1, 2, 5, 3, 7, 1, 2};

        System.out.println("\nMissing smallest positive integer: " + smallest(array)+"\n");

        TrafficTicket(90);

    }

    public static int[] removeValue(int[] array, int remove) {

        if (array == null || remove < 0 || remove >= array.length) {

           return array;
        }

        int[] anotherArray = new int[array.length - 1];

        for (int i =0;i<remove;i++) {
            anotherArray[i] = array[i+1];
        }

        return anotherArray;

    }

    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * 	For array : {1, 3, 5, 4, 2, 7}
     * 	Method should return : 6
     *
     * 	For array : {-1, -3, 4, 2}
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     */

    public static int smallest (int[] small) {
        int n = small.length;
        boolean[] present = new boolean[n+1];
        for (int i =0;i < n; i++){
            if(small[i]>0 && small[i]<=n){
                present[small[i]] = true;
            }
        }
        for (int i =1;i<=n;i++){
            if(!present[i]){
                return i;
            }
        }
        return n+1;
    }
/**
 * Question 3:
 * Scenario: Traffic ticketing system
 * Write a method, that will print (not return) the points charged against the license for over speeding.
 *    1. Speed Limit = 70
 *    2. Every 5 miles over the speed limit will add 1 point
 *    3. If user gets 12 points for a speed then license is suspended
 *
 *  Example:
 *      user speed = 78 ; 1 points
 *      user speed = 88 ; 3 points
 *      user speed = 178 ; 21 points (License suspended).
 *      user speed = 70 ; Thank you for driving within the speed limit.
 *
 *      88 -> 3
 *      70
 *      70-75 : 1
 *      75-80 : 1
 *      80-85 : 1
 *      85-88
 *
 */
public static void TrafficTicket (int userSpeed){

    int speedLimit=70;
    int points=0;
    int x=0;

    if (userSpeed>speedLimit){
    x=userSpeed-speedLimit;
    points = x/5;

        System.out.println("User speed: " + userSpeed + " ; " + points + " points");
    }

    else {
        System.out.println(userSpeed + " ; Thank you for driving within the speed limit");
    }

    if(points>=12){
        System.out.println("License suspended");
    }



}

}
