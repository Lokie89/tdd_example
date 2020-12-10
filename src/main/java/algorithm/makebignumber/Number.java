package algorithm.makebignumber;

import java.util.List;
import java.util.stream.Collectors;

public class Number {

    List<Character> numberCharList;
    int deleteCount;

    Number(String number) {
        numberCharList = number.chars().mapToObj(value -> (char) value).collect(Collectors.toList());
    }

    String delete(int count) {
        while (deleteCount < count) {
            deleteOne();
        }
        return numberCharList.stream().map(String::valueOf).collect(Collectors.joining());
    }

    private void deleteOne() {
        for (int i = 0; i < numberCharList.size() - 1; i++) {
            Character one = numberCharList.get(i);
            Character two = numberCharList.get(i + 1);
            if (one.compareTo(two) < 0) {
                numberCharList.remove(i);
                deleteCount++;
                break;
            }
            if (i == numberCharList.size() - 2) {
                numberCharList.remove(numberCharList.size() - 1);
                deleteCount++;
            }
        }
    }
}
