class Solution {
    public int[] solution(int n) {
        
        // 배열의 인덱스는 0으로 시작한다. 
        // 따라서 answer의 총 범위가 n+1이다.
        // 여기서 나누기 2를 한 것이 홀수 혹은 짝수의 길이이다.
        int[] answer = new int[(n+1)/2]; 
        
        for(int i = 1; i <= n; i++){     
            if(i % 2 == 1) // 홀수일 때
                answer[i/2] += i;
        }
        
        return answer;
    }
}
