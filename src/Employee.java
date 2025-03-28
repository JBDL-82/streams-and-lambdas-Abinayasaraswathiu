import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Employee {

public static List<String> checkSalary(Map<String, Double> map) {
    List<String> emp = map.entrySet().stream()
            .filter(x->x.getValue()>50000)
            .map(Map.Entry::getKey)
            .toList();
    return emp;
}
public static void main(String[] args) {
    Map<String ,Double> map = new HashMap<>();
    map.put("abi",30000d);
    map.put("vimal",80000d);
    map.put("indhu",60000d);
    map.put("adhi",40000d);
    System.out.println("Employees with more than 50000 salary" + checkSalary(map));

}
}
