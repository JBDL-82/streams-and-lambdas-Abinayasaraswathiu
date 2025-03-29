import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployee {
    public static void partitionCheck( Map<String,Integer> map)
    {
        List<String> result = map.entrySet().stream()
                .filter(x->x.getValue()>=5)
                .map(Map.Entry::getKey)
                .toList();
        List<String> result1 = map.entrySet().stream()
                .filter(x->x.getValue()<5)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Experience with more than 5 years "+ result);
        System.out.println("Experience with less than 5 years " + result1);


    }
    public static void main(String[] args) {


        Map<String,Integer> map = new HashMap<>();
        map.put("John", 5);
        map.put("Jane", 2);
        map.put("Jack", 6);
        map.put("Jill", 8);
        partitionCheck(map);


    }
}
