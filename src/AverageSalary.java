import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


    public class AverageSalary {
        String name;
        String deptName;
        Double Salary;
        public  String getName() {
            return name;
        }

        public  String getDeptName()
        {
            return deptName;
        }
        public Double getSalary() {
            return Salary;
        }
        AverageSalary(String name, String deptName, Double Salary) {
            this.name = name;
            this.deptName = deptName;
            this.Salary = Salary;
        }
        public static Map<String, Double> deptAvgSalary(List<AverageSalary> list) {
            Map<String, Double> map = list.stream()
                    .collect(Collectors.groupingBy(AverageSalary::getDeptName,
                            Collectors.averagingDouble(AverageSalary::getSalary)
                    ));
            return map;

        }
        public static void main(String[] args) {
            List<AverageSalary> list = Arrays.asList(
                    new AverageSalary("Abi","Doctor",30000d),
                    new AverageSalary("Prithvi","Engineer",20000d),
                    new AverageSalary("Mahathi","Doctor",50000d),
                    new AverageSalary("Mithran","Engineer",40000d));

            System.out.println(deptAvgSalary(list));
        }
    }


