import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Thread t1 = new Thread(test);
        t1.start();

     /*   final List<Integer> integers = Arrays.asList(1, 2);
        final List<String> converted = convertJava8(null);
        System.out.println(converted);*/
    }

    public static List<String> convert(final List<Integer> input) {
        final List<String> result = new ArrayList<>();
        if (input != null) {
            for (final Integer integer : input) {
                result.add(String.valueOf(integer));
            }
        }
        return result;
    }

    public static List<String> convertJava8(final List<Integer> input) {
        //Optional<List<String>> result  = Optional.ofNullable(input).stream().map(a -> String.valueOf(a)).collect(Collectors.toList());
       /* final List<String> result = new ArrayList<>();
        if (input != null) {
            for (final Integer integer : input) {
                result.add(String.valueOf(integer));
            }
        }*/

        return Optional.ofNullable(input)
                .orElse(new ArrayList<>())
                .stream()
                .map(String::valueOf)
                .collect(Collectors.toList());


        //return result;
    }
}

class Test extends Thread{
    private long requestCount;

    public void call() {
        requestCount += 1;
        System.out.println("requestCount" + requestCount);
    }
}