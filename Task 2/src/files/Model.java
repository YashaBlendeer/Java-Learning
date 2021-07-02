package files;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Model {
    private int value;
    private int minValueCurrent;
    private int maxValueCurrent;
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

    public void setMinValueCurrent(int minValueCurrent) {
        this.minValueCurrent = minValueCurrent;
    }

    public void setMaxValueCurrent(int maxValueCurrent) {
        this.maxValueCurrent = maxValueCurrent;
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
        //add 1 to max to make it inclusive
        //add 1 to min to make it exclusive
        value = ThreadLocalRandom.current().nextInt(min + 1 , max);
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
