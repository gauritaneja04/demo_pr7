public class KmToMiles {

    public static void main(String[] args) {

        // Given distance in kilometers
        double kilometers = 10.8;

        // Conversion factor
        double conversionFactor = 1.6;

        // Convert to miles
        double miles = kilometers * conversionFactor;

        // Display result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}