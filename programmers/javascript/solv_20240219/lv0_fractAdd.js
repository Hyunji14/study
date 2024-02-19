function solution(numer1, denom1, numer2, denom2) {
  let answer = [];
  let c = 1;
  let num = numer1 * denom2 + numer2 * denom1;
  let denom = denom1 * denom2;

  for (let i = 2; i <= Math.min(num, denom); i++) {
    if (num % i === 0 && denom % i === 0) {
      c = i;
    }
  }

  answer.push(num / c);
  answer.push(denom / c);

  return answer;
}

console.log(solution(1, 2, 3, 4));
