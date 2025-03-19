class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        // 만약 n이 slice로 나누어 떨어지면,
        if(n % slice == 0)
            // 피자 한 개로 나눠서 딱 나눠지기 때문에 필요한 피자의 개수는 n / slice
            answer = n / slice;
        else 
            // n이 slice로 나누어 떨어지지 않으면, (n / slice)개 피자에 한 조각을 추가해야 하므로
            answer = n / slice + 1;
        
        return answer;
    }
}
