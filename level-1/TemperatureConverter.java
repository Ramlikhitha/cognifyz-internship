import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of measurement");
        System.out.println("Enter c or C for Celsius, F for Fahrenheit");
        char unit = scanner.next().charAt(0);

        double convertedTemperature;

        if (unit == 'C' || unit == 'c') {
            // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println("Celsius converted to Fahrenheit:");
            System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, convertedTemperature);
        } else if (unit == 'F' || unit == 'f') {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println("Fahrenheit converted to Celsius:");
            System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, convertedTemperature);
        } else {
            System.out.println("Invalid unit of measurement. Please enter C for Celsius or F for Fahrenheit.");
        }
    }
}