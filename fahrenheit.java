public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

    double celsius = (fahrenheit - 32) * 5.0/9.0;

    System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
  }
}
