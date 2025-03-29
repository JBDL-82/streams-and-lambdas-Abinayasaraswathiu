
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class JoinStrings {

    public static String join(List<String> words) {

        String merged = words
                .stream()

                .collect(Collectors.joining(","));

        return merged;
    }
    public static void main(String[] args) {
        List<String> words =  Arrays.asList("Java", "Python", "C++", "C");

System.out.println("Joined String is " +join(words));

    }
}
