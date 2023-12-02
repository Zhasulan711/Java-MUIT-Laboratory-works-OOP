package thirdExercise;

public class Dataset {
    private double sum;
    private double max;
    private int count;
    
    public Dataset() {
        sum = 0;
        max = Double.MIN_VALUE;
        count = 0;
    }
    public void addValue(double value) {
        sum += value;
        if (value>max) {
            max = value;
        }
        count++;
    }
    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum/count;
    }
    public double getMax(){
        return max;
    }
}
