import java.util.*;

public class DuplicateCounter {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(56);
        nums.add(5);
        nums.add(5);
        nums.add(2);
        nums.add(1);
        nums.add(56);
        nums.add(-5);
        nums.add(45);
        nums.add(1);
        nums.add(14);
        nums.add(56);

        Map<Integer, Integer> map = new TreeMap<>();

        int val;
        for(int num : nums) {
            if (map.containsKey(num)){
                val = map.get(num);
                val++;
                map.put(num, val);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
