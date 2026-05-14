import java.util.*;
import java.util.stream.*;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenList = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<Integer> oddList = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        evenList.forEach(n -> System.out.print(n +"\t"));
        System.out.println();
        oddList.forEach(n -> System.out.print(n +"\t"));
    }
}
