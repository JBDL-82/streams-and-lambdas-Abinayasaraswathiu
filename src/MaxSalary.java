import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.stream;

public class MaxSalary {
    public static String checkMaxSalary(Map<String,Double> map)
    {
        String employee = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
        return employee;
    }
    public static void main(String[] args) {
        Map<String ,Double> map = new HashMap<>();
        map.put("abi",30000d);
        map.put("vimal",20000d);
        map.put("indhu",60000d);
        map.put("adhi",40000d);

       System.out.println("Employee with maximum salary is "+ checkMaxSalary(map));










    }
}
