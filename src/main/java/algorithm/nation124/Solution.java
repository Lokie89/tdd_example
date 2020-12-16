package algorithm.nation124;

public class Solution {

    String solution(int n) {
        if (n % 3 == 0) {
            n -= 3;
        }
        BaseConverter baseConverter = new BaseConverter(3);
        Base convertBase = baseConverter.convert(10, n);
        String numberStr = String.valueOf(convertBase.getNumber());
        char[] numberStrCharArray = numberStr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char num : numberStrCharArray) {
            switch ((num - 48)) {
                case 0:
                    sb.append("4");
                    break;
                case 1:
                    sb.append("1");
                    break;
                case 2:
                    sb.append("2");
                    break;
            }
        }
        return sb.toString();
    }
}
