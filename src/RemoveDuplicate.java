import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class RemoveDuplicate {
    public static Set<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> result = list.stream()
                .filter(i -> Collections.frequency(list, i) > 0)
                .collect(Collectors.toSet());
return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 1, 2);
System.out.println(removeDuplicates(numbers));
    }
}
