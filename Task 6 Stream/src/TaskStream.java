import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskStream {
    public static void main(String[] args) {
        int[] nums = {4, 6, 1, 17, -15, 0};
        System.out.println(calcAverage(nums));
        System.out.println(getZeroElements(nums));
        System.out.println(getPositiveElements(nums));
        multiplyElements(nums, 2);
        System.out.println(findMinElement(nums));
    }

    public static double calcAverage(int[] arr) {
        return IntStream.of(arr).filter(x -> x != 0).average().getAsDouble();
    }

    public static Map.Entry<Integer, Integer> findMinElement(int[] arr) {
        TreeMap<Integer, Integer> map = IntStream
                .range(0, arr.length) //0 1 2 3 4 5
                .boxed()
                .collect(Collectors.toMap(
                        i -> arr[i],
                        Function.identity(),
                        (oldValue,
                         newValue)
                                -> newValue,
                        TreeMap::new
                ));
        return map.firstEntry();
    }

    public static int getZeroElements(int[] arr) {
        return (int) IntStream.of(arr).filter(x -> x == 0).count();
    }

    public static int getPositiveElements(int[] arr) {
        return (int) IntStream.of(arr).filter(x -> x > 0).count();
    }

    public static void multiplyElements(int[] arr, int factor) {
        IntStream.of(arr).map(x -> x * factor).forEach(x -> System.out.format("%s, ", x));
    }


}
