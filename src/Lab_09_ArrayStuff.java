import java.util.Random;

public class Lab_09_ArrayStuff {
    static void main() {
        //declarations
            int[] dataPoints = new int[100];
            Random rand = new Random();
            int sum = 0;
            double average = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            System.out.print(" | ");
        }

        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        average = sum / 100;
        System.out.println("\nThe sum of the random array is: " + sum);
        System.out.println("The average of the random array is: " + average);

    }
}
