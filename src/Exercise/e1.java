package Exercise;

import Homeworks.HW4;

public class e1 {
    public static void main(String[] args) {

        String msg = "Hello";
        String reversedMsg = reverseM(msg);
        System.out.println("Reverse of "+ msg + " is: " + reversedMsg);

        String checkForPalindrome = "Level";
        System.out.println("Is "+checkForPalindrome+" a palindrome: "+palindrome(checkForPalindrome));

        int[]numbers = {11,22,33,44,56};
        double numbersTotal = arrayTotal(numbers) / numbers.length;

        System.out.println("Total: " + numbersTotal);


        for (int i =0;i<=15;i+=2) {
            System.out.println("hello");
        }

    }
    public static String reverseM (String message1){

        String reverseMessage = "";
        System.out.println("Message : " + message1);
        //String[] messages = message1.split(" ");
        for (int i = message1.length() - 1; i >= 0; i--) {
            reverseMessage = reverseMessage + message1.charAt(i);
        }
        return reverseMessage;
    }

    public static boolean palindrome(String checkWord){
        String reversed = reverseM(checkWord);
        return reversed.equalsIgnoreCase(checkWord);
    }
    public static  double arrayTotal(int[] array){

        int total = 0;
        for (int value : array){
            total = total + value;


        }
        return total;
    }
}

