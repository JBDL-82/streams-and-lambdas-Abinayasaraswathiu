import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeptwithNoEmployee {

        public static void noEmployeeDept(Map<String,String> map) {
            List<String> department = map.entrySet().stream()
                    .filter(x->x.getValue().matches(" "))
                    .map(Map.Entry::getKey).toList();
            System.out.println(department);
        }
        public static void main(String[] args)
        {
            Map<String,String> map = new HashMap<>();
            map.put("Doctor", " ");
            map.put("Engineer", " ");
            map.put("Lawyer", "adhi");
            map.put("Police", "abi");
            noEmployeeDept(map);

        }
    }

