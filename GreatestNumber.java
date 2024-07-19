import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestNumber {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] numbers = new int[5];

    try {
      System.out.print("Enter number 1: ");
      numbers[0] = Integer.parseInt(reader.readLine());

      System.out.print("Enter number 2: ");
      numbers[1] = Integer.parseInt(reader.readLine());

      System.out.print("Enter number 3: ");
      numbers[2] = Integer.parseInt(reader.readLine());

      System.out.print("Enter number 4: ");
      numbers[3] = Integer.parseInt(reader.readLine());

      System.out.print("Enter number 5: ");
      numbers[4] = Integer.parseInt(reader.readLine());

      int max = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
          max = numbers[i];
        }
      }

      System.out.println("The greatest number is: " + max);
    } catch (IOException e) {
      System.err.println("Error reading input: " + e.getMessage());
    }
  }
}