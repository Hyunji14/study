const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [n, k] = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split(' ')
  .map((item) => +item);

solution(n, k);

function solution(n, k) {
  let factors = [];
  let answer = 0;

  for (let i = 1; i <= n; i++) {
    if (n % i === 0) {
      factors.push(i);
    }
  }

  if (factors.length >= k) {
    answer = factors[k - 1];
  }

  console.log(answer);
}
