import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 10, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num%2!=0) {
                System.out.println(num);
            }

        }
        System.out.println("Задание 2");

        for (int e : new TreeSet <Integer> (nums)) {
            if (e % 2 == 0) {
                System.out.println(e);
            }

        }
        System.out.println("Задание 3");
        String text = "друг мой друг мой я очень и очень болен";
        String regex = " ";
        Set<String> words = new HashSet<>(List.of(text.split(regex)));
        for (var word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("Задание 4");

        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if(!map.containsKey(string)){
                map.put(string, 0);
            } else {
                map.replace(string, map.get(string)+1);
            }
            //for (Integer count:map.values())
        }
        System.out.println(map.values());


    }
}