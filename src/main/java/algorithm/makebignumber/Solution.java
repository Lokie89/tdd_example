package algorithm.makebignumber;

public class Solution {
    public String solution(String number, int k) {
        Number n = new Number(number);
        return n.delete(k);
    }
}
