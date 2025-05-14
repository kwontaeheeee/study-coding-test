function solution(n) {
    let answer = 1;
    let i = 1;
    while (answer <= n) {
        answer *= i;
        if (answer > n) break;
        i++;
    }
    return i - 1;
} 