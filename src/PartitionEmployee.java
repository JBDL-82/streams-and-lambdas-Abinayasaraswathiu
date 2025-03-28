import java.util.HashMap;
import java.util.Map;

public class PartitionEmployee {
    public static void partitionCheck( Map<String,Integer> map)
    {

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
