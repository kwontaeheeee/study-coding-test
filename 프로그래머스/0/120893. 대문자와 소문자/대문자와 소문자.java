
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        // 문자열을 순회하며 대소문자 변환
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isLowerCase(ch)) {
                answer.append(Character.toUpperCase(ch));
            } else {
                answer.append(Character.toLowerCase(ch));
            }
        }

        return answer.toString();
    }
}
