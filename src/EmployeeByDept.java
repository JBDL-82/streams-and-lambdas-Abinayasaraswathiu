import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeByDept {

          String name;
          String deptName;

        public  String getName() {
            return name;
        }

        public  String getDeptName()
        {
            return deptName;
        }
        EmployeeByDept(String name, String deptName) {
            this.name = name;
            this.deptName = deptName;
        }

        public static Map<String, List<String>> groupByDept(List<EmployeeByDept> list) {
            Map<String,List<String>> map = list.stream()
                    .collect(Collectors.groupingBy(EmployeeByDept::getDeptName,
                            Collectors.mapping(EmployeeByDept::getName,Collectors.toList())
                    ));
            return map;

        }
        public static void main(String[] args)
        {
            List<EmployeeByDept> list = Arrays.asList(
                    new EmployeeByDept("Abi","Doctor"),
                    new EmployeeByDept("Prithvi","Engineer"),
                    new EmployeeByDept("Mahathi","Doctor"),
                    new EmployeeByDept("Mithran","Engineer"));


            System.out.println(groupByDept(list));

        }
    }


