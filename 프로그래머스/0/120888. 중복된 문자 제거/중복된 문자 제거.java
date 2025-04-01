import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> charSet = new LinkedHashSet<>();  // 순서 보존하면서 중복 제거
        for (char ch : my_string.toCharArray()) {
            charSet.add(ch);  // 중복된 문자 자동으로 제거
        }

        StringBuilder result = new StringBuilder();
        for (char ch : charSet) {
            result.append(ch);  // Set에서 순서대로 문자 추가
        }

        return result.toString();
    }
}
