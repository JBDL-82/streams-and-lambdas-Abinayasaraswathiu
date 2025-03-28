
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TopthreeSalaries {

public static List<String> topSalary(Map<String,Double> map) {
    List<String> employee = map.entrySet().stream()
            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
            .limit(3)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
return employee;

}


    public static void main(String[] args) {
        Map<String ,Double> map = new HashMap<> ();
        map.put("abi",30000d);
        map.put("vimal",20000d);
        map.put("indhu",60000d);
        map.put("adhi",40000d);
        System.out.println("Top 3 Highest paid Employees are "+topSalary(map));

    }
}
