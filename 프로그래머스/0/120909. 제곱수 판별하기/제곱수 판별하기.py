class Solution {
 public int solution(int n) {
 int x = 1; // 제곱수를 찾기 위한 초기값 설정
 while (x * x <= n) { // x^2이 n을 초과하지 않는 동안 반복
 if (x * x == n) { // x^2이 n과 같다면 제곱수
 return 1;
 }
 x++; // x 증가
 }
 return 2; // 제곱수를 찾지 못하면 2 반환
 }
 public static void main(String[] args) {
 Solution sol = new Solution();
 // 테스트 예제 실행
 System.out.println(sol.solution(144)); // 1 (12*12)
 System.out.println(sol.solution(976)); // 2 (제곱수가 아님)
 }
}


