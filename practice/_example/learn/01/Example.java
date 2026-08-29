/**
 * Lesson 01 - Variables and types.
 * Exercise 5: a short "ideal robot" report using each basic type.
 *
 * Run: from this folder, `java Example.java`
 */
public class Example {
  public static void main(String[] args) {
    String robotName = "Proto";
    double weightKilograms = 54.4;
    double topSpeedMetersPerSecond = 4.2;
    int motorCount = 6;
    boolean hasCamera = true;

    final double POUNDS_PER_KILOGRAM = 2.20462;
    double weightPounds = weightKilograms * POUNDS_PER_KILOGRAM;

    System.out.println("Robot: " + robotName);
    System.out.println("Weight: " + weightKilograms + " kg (" + weightPounds + " lb)");
    System.out.println("Top speed: " + topSpeedMetersPerSecond + " m/s");
    System.out.println("Motors: " + motorCount);
    System.out.println("Has camera: " + hasCamera);
  }
}
