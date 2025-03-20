class Solution {
    public int solution(int n) {
        int answer = 0;

        // 1부터 n까지 모든 숫자에 대해 나누어 떨어지는지 확인
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;  // 약수의 개수 반환
    }
}

