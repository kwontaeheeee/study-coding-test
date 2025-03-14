class Solution {
    public String solution(String my_string) {
        // StringBuilder를 사용하여 문자열을 반전
        StringBuilder str = new StringBuilder(my_string);
        System.out.println(str.reverse());  // 반전된 문자열 출력
        
        return str.toString();  // 반전된 문자열을 반환
    }
}

