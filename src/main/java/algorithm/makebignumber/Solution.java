package algorithm.makebignumber;

public class Solution {
    public String solution(String number, int k) {
        Number n = new Number(number);
        int[] sortDeletedNumbers = n.delete(k);
        return String.valueOf(sortDeletedNumbers[sortDeletedNumbers.length - 1]);
    }
}
