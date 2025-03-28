import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.stream;

public class MaxSalary {
    public static void main(String[] args) {
        Map<String ,Double> map = new HashMap<>();
        map.put("abi",30000d);
        map.put("vimal",20000d);
        map.put("indhu",60000d);
        map.put("adhi",40000d);
       String employee = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
               .get().getKey();
       System.out.println(employee);






    }
}
