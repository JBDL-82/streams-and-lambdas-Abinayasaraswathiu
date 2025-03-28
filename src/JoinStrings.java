import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class JoinStrings {

    public static String join(List<String> words) {

        String joinedString = words
                .stream()
               // .map(x -> x + ", ")
               // .reduce("", (x, y) -> x + y);
                .collect(Collectors.joining(",", "[", "]"));

        return joinedString;
    }
    public static void main(String[] args) {
        List<String> words =  Arrays.asList("Java", "Python", "C++", "C");

System.out.println(join(words));

    }
}
