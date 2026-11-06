import java.util.Random;

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

    }
}
