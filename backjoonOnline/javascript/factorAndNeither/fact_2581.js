const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [m, n] = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split('\n')
  .map((item) => +item);

solution(m, n);

function solution(m, n) {
  const array = Array(n - m + 1)
    .fill()
    .map((_, index) => m + index);

  const answer = array.filter((num) => {
    for (let i = 2; i < num; i++) {
      if (num % i === 0) {
        return false;
      }
    }

    return num > 1;
  });

  if (answer.length) {
    console.log(answer.reduce((total, prime) => (total += prime)));
    console.log(answer[0]);
  } else {
    console.log(-1);
  }
}

function solution(m, n) {
  let answer = [];

  for (let i = m; i <= n; i++) {
    if (i === 1) {
      continue;
    } else {
      let isPrime = true;

      for (let j = 2; j < i; j++) {
        if (i % j === 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) answer.push(i);
    }
  }

  if (answer.length) {
    console.log(answer.reduce((total, prime) => (total += prime)));
    console.log(answer[0]);
  } else {
    console.log(-1);
  }
}
