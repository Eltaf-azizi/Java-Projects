import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches");
        double height = input.nextDouble();

        System.out.println(weight);
        System.out.println(height);

        double bmi = weight / Math.pow(height, 2) * 703;
        System.out.println("Your BMI is: " + bmi);
    }
}
