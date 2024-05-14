import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();

        System.out.println("Enter height in feet:");
        int heightFeet = input.nextInt();

        System.out.println("Enter height in inches");
        int heightInches = input.nextInt();

        int totalHeightInInches = (heightFeet * 12) + heightInches;
        input.close();

        double bmi = weight / Math.pow(totalHeightInInches, 2) * 703;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your BMI is: " + df.format(bmi));
    }
}