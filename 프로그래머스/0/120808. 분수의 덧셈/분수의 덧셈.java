class Solution {
 public int[] solution(int numer1, int denom1, int numer2, int denom2) {
 // 분자 계산: (a * d) + (c * b)
 int numer3 = numer1 * denom2 + numer2 * denom1;
 // 분모 계산: b * d
 int denom3 = denom1 * denom2;
 // 최대공약수(GCD) 구하기
 int gcd = gcd(numer3, denom3);
 // 기약 분수로 변환
 return new int[]{numer3 / gcd, denom3 / gcd};
 }
 // 유클리드 호제법을 이용한 최대공약수(GCD) 계산
 private int gcd(int a, int b) {
 while (b != 0) {
 int temp = b;
 b = a % b;
 a = temp;
 }
 return a;
 }
}
