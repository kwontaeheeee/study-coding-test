class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int num = i; num <= j; num++) {
            String str = Integer.toString(num);
            count += str.length() - str.replace(Integer.toString(k), "").length();
        }
        return count;
    }
}
