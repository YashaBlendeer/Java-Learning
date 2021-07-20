import java.util.*;

public class DuplicateCounter {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>(List.of(56, 5, 5, 2, 1, 56, -5, 45, 1, 14, 56));
        Map<Integer, Integer> map = new TreeMap<>();

        int val;
        for(int num : nums) {
            val = map.containsKey(num) ? map.get(num) + 1 : 1;
            map.put(num, val);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
