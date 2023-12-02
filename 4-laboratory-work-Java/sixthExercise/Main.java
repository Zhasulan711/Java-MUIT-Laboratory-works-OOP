package sixthExercise;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        // AvgSum avgsum = new AvgSum();
        AvgSum.Result result = AvgSum.avgSum(numbers);

        System.out.println("Average:" + result.average);
        System.out.println("Sum" + result.sum);
    }

}
