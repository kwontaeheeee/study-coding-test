class Solution {
    public int solution(String A, String B) {
        if (A.length() != B.length()) {
            return -1;
        }

        String str = A;
        for (int i = 0; i < A.length(); i++) {
            if (str.equals(B)) {
                return i;
            }

            str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("hello", "ohell"));
        System.out.println(sol.solution("hello", "lohel"));
        System.out.println(sol.solution("hello", "world"));
    }
}
