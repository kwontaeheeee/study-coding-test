
class Solution {
    public int solution(String my_string) {
        int sum = 0;
        char[] unit = my_string.toCharArray();
        
        for (char u : unit) {
            if (Character.isDigit(u)) {
                sum += Character.getNumericValue(u);
            }
        }
        
        return sum;
    }
}
