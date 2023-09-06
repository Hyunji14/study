const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const n = fs.readFileSync(filePath).toString().trim();
solution(+n);

function solution(n) {
  let reminder = n;
  let answer = [];

  for (let i = 2; i <= n; i++) {
    while (reminder % i === 0) {
      reminder /= i;
      answer.push(i);
    }
    if (reminder === 1) break;
  }

  console.log(answer.join('\n'));
}
