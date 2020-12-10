package algorithm.makebignumber;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Number {

    String number;

    Number(String number) {
        this.number = number;
    }

    int[] delete(int count) {
        return deleteOne(number).stream().mapToInt(value -> value).toArray();
    }

    private HashSet<String> deleteOne(String number) {
        HashSet<String> numberSet = new HashSet<>();
        char[] numberCharArray = number.toCharArray();
        for (int i = 0; i < numberCharArray.length; i++) {
            int finalI = i;
            String removedNumber = IntStream.range(0, numberCharArray.length)
                    .filter(index -> finalI != index)
                    .mapToObj(index -> String.valueOf(numberCharArray[index]))
                    .collect(Collectors.joining());
            numberSet.add(removedNumber);
        }
        return numberSet;
    }
}
