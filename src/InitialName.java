import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class InitialName {

    public static Map<Character,List<String>> groupByInitial(List<String> employees)
    {
        Map<Character,List<String>> map = employees.stream()
            .collect(Collectors.toMap(x -> x.charAt(0),
                    x -> employees.stream().filter(y -> y.startsWith(String.valueOf(x.charAt(0))))
                                            .collect(Collectors.toList()),
                                    (oldValue, newValue) -> oldValue, HashMap::new));


        return map;
    }
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Abi", "Mahathi", "Mithran", "Asha");
        System.out.println(groupByInitial(employees));
    }

}
