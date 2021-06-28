import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Model {
    private int value;
    private int minValueCurrent = 0;
    private int maxValueCurrent = 100;
    private ArrayList<Integer> tries = new ArrayList<>();

    public int getValue() {
        return value;
    }

    public int getMinValueCurrent() {
        return minValueCurrent;
    }

    public int getMaxValueCurrent() {
        return maxValueCurrent;
    }

    public ArrayList<Integer> getTries() {
        return tries;
    }

    public ArrayList<Integer> setTries(int comparableValue) {
        tries.add(comparableValue);
        return tries;
    }

    // The Utility methods

    public int generateNumber(int min, int max) {
        //add 1 to make it inclusive
        value = ThreadLocalRandom.current().nextInt(min, max + 1);
        return value;
    }

    public boolean compareValue(int comparableValue) {
        if(comparableValue > value && comparableValue < maxValueCurrent) {
            maxValueCurrent = comparableValue;
        } else if (comparableValue < value && comparableValue > minValueCurrent) {
            minValueCurrent = comparableValue;
        }
        return comparableValue == value;
    }



}
