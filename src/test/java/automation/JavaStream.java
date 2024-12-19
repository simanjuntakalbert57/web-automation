package automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,10,11,12);
        List<Integer> result = new ArrayList<>();


        // Menggunakan tradisional looping
        for (Integer integer : numbers) {
            //Filtering
            if (integer>5) {
                result.add(integer);
            }
        }

        System.out.println(result);

        //Filtering
        result = numbers.stream().filter(integer -> integer > 5).collect(Collectors.toList());

        System.out.println("stream" + result);
    }
}
