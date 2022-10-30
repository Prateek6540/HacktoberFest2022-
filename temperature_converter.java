import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.println("Temperature Converter. ");
        System.out.println("1 - Celsius to Fahrenheit.");
        System.out.println("2 - Fahrenheit to Celsius.");

        try{
            choice = scan.nextInt();
        }catch (Exception e){
            System.out.println("The value you have entered is not a valid integer");
        }
        
        switch (choice){
            case 1:
                System.out.print("Enter a temperature in Celsius: ");
                float celsius = scan.nextFloat();
                System.out.printf("Temperature in Fahrenheit is: %.1f", CelsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.print("Enter a temperature in Fahrenheit: ");
                float fahrenheit = scan.nextFloat();
                System.out.printf("Temperature in Celsius is: %.1f" , FahrenheitToCelsius(fahrenheit));
                break;
            default:
                System.out.printf("Error: Enter a Valid Option!");
                break;
        }
    }

    static float CelsiusToFahrenheit(float celsius) { return (1.8f * celsius) + 32;}
    static float FahrenheitToCelsius(float fahrenheit) { return (fahrenheit - 32) / 1.8f;}


}