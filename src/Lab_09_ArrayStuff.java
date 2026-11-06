import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    static void main() {
        //declarations
            int[] dataPoints = new int[100];
            Random rand = new Random();
            int sum = 0;
            double average = 0;

        //use a loop to assign a random number to each position in the array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        //output each random number in the array by using a loop
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            System.out.print(" | ");
        }

        //Get the sum of each part of the array
        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        average = sum / 100; //use the newly found sum to calculate average
        //output
        System.out.println("\nThe sum of the random array is: " + sum);
        System.out.println("The average of the random array is: " + average);



        //PART 2
        //declarations
            Scanner input = new Scanner(System.in);
            int userRangedInt = SafeInput.getRangedInt(input, "Enter a number between 1 and 100", 1, 100);
            int userIntFound = 0; //Used to track how many times a number was found in the array

            //Loop through the array and add 1 to userIntFound whenever one of the points is equal to the user's number
            for (int i = 0; i < dataPoints.length; i++) {
                if (dataPoints[i] == userRangedInt) {
                    userIntFound += 1;
                }
            }
            //output : If the user's number could not be located, then userIntFound will be 0
            if (userIntFound == 0){
                System.out.println("Looks like your number was never in the array");
            }else{
                System.out.println("Hey! your number, " + userRangedInt + " was in the array " + userIntFound + " time(s)!");
            }


    }
}
