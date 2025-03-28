import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {

    public static Map<String, Long> countFruits(List<String> fruits) {

        Map<String, Long> map = fruits.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return map;
    }
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple");;

System.out.println(countFruits(fruits));






    }
}
