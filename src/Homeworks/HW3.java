package Homeworks;

public class HW3 {
    public static void main(String[] args) {

        /**
         * Create variable to store student-score, and total-possible-score based on the percentage,
         * display grade to student
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        int studentScore = 115;
        int maxScore = 150;
        String display = "";
        //calculate percentage
        //Your percentage: XX.yy and your grade is: A

        double percentage = (studentScore * 100 / maxScore);

        if (percentage >= 91 && percentage <= 100) {
            System.out.println(percentage + "% and your grade is: A");
        } else if (percentage >= 81 && percentage <= 90) {
            System.out.println(percentage + "% and your grade is: B");
        } else if (percentage >= 71 && percentage <= 80) {
            System.out.println(percentage + "% and your grade is: C");
        } else if (percentage >= 61 && percentage <= 70) {
            System.out.println(percentage + "% and your grade is: D");
        } else if (percentage >= 51 && percentage <= 60) {
            System.out.println(percentage + "% and your grade is: E");
        } else if (percentage <= 50) {
            System.out.println(percentage + "% and your grade is: F");
        }





        /**
         * Checking car mode (P, D, N, R)
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */

        char carMode = 'D';

        String driveType = "EcO";
        String updateDriveType = driveType.toLowerCase();

        switch (carMode) {
            case 'P':
                System.out.println("You can park car");
                break;
            case 'D':
                switch (updateDriveType) {
                    case "snow":
                        System.out.println("You are on snow mode");
                        break;
                    case "sport":
                        System.out.println("You are on sport mode");
                        break;
                    case "eco":
                        System.out.println("You are on eco mode");
                        break;
                    default:
                        System.out.println("Invalid drive type");
                        break;

                }
                break;

            case 'N':
                System.out.println("Put car in wash");
                ;
                break;
            case 'R':
                System.out.println("Revere the car");
                ;
            default:
                System.out.println("Invalid care mode: " + carMode);
        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */

        int num = 15;


        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by both");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else if(num % 3 == 0) {
            System.out.println("Divisible by 3");
        }else {
            System.out.println(num);
        };
        

    }
}
