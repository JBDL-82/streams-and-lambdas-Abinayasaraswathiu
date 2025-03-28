
import java.util.*;
import java.util.stream.Collectors;


public class SortEmployee {

    public static List<String> sortBySalary(Map<String,Double> map) {
        List<String> emp =map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return emp;

    }


    public static void main(String[] args) {
        Map<String ,Double> map = new HashMap<> ();
        map.put("abi",30000d);
        map.put("vimal",20000d);
        map.put("indhu",60000d);
        map.put("adhi",40000d);
        System.out.println(sortBySalary(map));

    }
}
