package exercícios_19_05;

public class ArrayPercentageNoLoopCopilot {
    public static void main(String[] args) {
        // Define the array with three values
        double[] values = {30, 50, 20}; // Example values

        // Calculate the total sum
        double total = values[0] + values[1] + values[2];

        // Calculate percentages
        double percentage1 = (values[0] / total) * 100;
        double percentage2 = (values[1] / total) * 100;
        double percentage3 = (values[2] / total) * 100;

        // Display percentages
        System.out.printf("Value 1: %.2f%%\n", percentage1);
        System.out.printf("Value 2: %.2f%%\n", percentage2);
        System.out.printf("Value 3: %.2f%%\n", percentage3);
    }
}