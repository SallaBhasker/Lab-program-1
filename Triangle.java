

public class TriangleAngles {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter angle 1: ");
    double angle1 = scanner.nextDouble();

    System.out.print("Enter angle 2: ");
    double angle2 = scanner.nextDouble();

    System.out.print("Enter angle 3: ");
    double angle3 = scanner.nextDouble();

    if (angle1 + angle2 + angle3 == 180) {
      System.out.println("The angles form a triangle.");
    } else {
      System.out.println("The angles do not form a triangle.");
    }
  }
}