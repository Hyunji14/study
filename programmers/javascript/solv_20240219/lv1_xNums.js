function solution(x, n) {
  let number = x;
  let answer = [];

  for (let i = 0; i < n; i++) {
    answer.push(number);

    number += x;
  }
  return answer;
}

console.log(solution(2, 5));
