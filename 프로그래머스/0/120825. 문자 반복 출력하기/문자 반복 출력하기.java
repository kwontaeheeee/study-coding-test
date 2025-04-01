
    class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        // my_string의 각 문자를 n번 반복하여 answer에 추가
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer.append(my_string.charAt(i));  // 문자 반복 출력
            }
        }
        
        return answer.toString();  // StringBuilder를 String으로 변환하여 반환
    }
}
