package Homeworks;

public class HW4 {
    public static void main(String[] args) {

        /**
         * Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day" //
         * Expected: OOTD //GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */
        String msg = "have a great day to me";
        String abr = "";
        String[] message = msg.split(" ");
        for (String value : message) {
            abr += value.toUpperCase().charAt(0);

        }
        System.out.println("Abbreviation : " + abr);


        String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        String[] lineS = line.split(" ");
        String upper = "";
        for (String sentence : lineS) {
            upper += sentence.substring(0, 1).toUpperCase() + sentence.toLowerCase().substring(1) + " ";
            line = upper;
        }
        System.out.println("Line (After modification) : " + line.trim());


        /**
         * reverse a string
         */
        String message1 = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message1);
        //String[] messages = message1.split(" ");
        for (int i = message1.length() - 1; i >= 0; i--) {
            reverseMessage = reverseMessage + message1.charAt(i);
        }


        System.out.println("Message in reverse: " + reverseMessage);


        /**
         * Check if word is palindrome
         */
        String word = "level";
        boolean result=false;
        String reverseWord ="";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        System.out.println(reverseWord);

        if (word.equalsIgnoreCase(reverseWord)) {
            result=true;
        }
        System.out.println("is " + word + " a palindrome: " + result);

    }
}
