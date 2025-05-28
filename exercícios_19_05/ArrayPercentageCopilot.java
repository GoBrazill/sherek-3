package exercícios_19_05;

public class ArrayPercentageCopilot {
    public static void main(String[] args) {
        // Define the array with three values
        double[] values = {30, 50, 20}; // Example values

        // Calculate the total sum
        double total = 0;
        for (double value : values) {
            total += value;
        }

        // Display percentages
        System.out.println("Percentage of each value:");
        for (double value : values) {
            double percentage = (value / total) * 100;
            System.out.printf("%.2f%%\n", percentage); // Formatting to 2 decimal places
        }
    }
}  


