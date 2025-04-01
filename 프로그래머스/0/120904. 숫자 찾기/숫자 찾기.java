class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);
        String[] arr = str.split("");
        char targetChar = (char) ('0' + k);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(String.valueOf(targetChar))) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}
