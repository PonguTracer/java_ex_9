import java.util.Scanner;
import java.util.Random;

public class LabProgram {

   // Define the showResults method to return a boolean
   public static boolean showResults(Random rand) {
      int randomNumber = rand.nextInt(2); // Generate 0 or 1

      return randomNumber == 1; // Returns true if randomNumber is 1, else false
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Seed used in develop mode
      int numberOfTimes;

      // Get user input
      numberOfTimes = scnr.nextInt();

      for (int i = 0; i < numberOfTimes; i++) {
         // Call showResults method and print the boolean result
         System.out.println(showResults(rand));
      }
   }
}
