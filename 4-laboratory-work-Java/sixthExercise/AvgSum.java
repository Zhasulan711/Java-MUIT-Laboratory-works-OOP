package sixthExercise;

public class AvgSum {
    static class Result {
        double average;
        int sum;

        public Result(double average, int sum) {
            this.average = average;
            this.sum = sum;
        }
    }

    public static Result avgSum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new Result(0.0,0); // average 0.0, sum: 0
        }

        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }

        double average = (double) sum/numbers.length;
        return new Result(average, sum);
    }
}