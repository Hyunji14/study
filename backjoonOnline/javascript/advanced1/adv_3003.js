const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split(' ')
  .map((item) => +item);

solution(input);

function solution(input) {
  const chess = [1, 1, 2, 2, 2, 8];
  let answer = '';

  for (let i = 0; i < chess.length; i++) {
    if (chess[i] !== input[i]) {
      answer += chess[i] - input[i] + ' ';
    } else {
      answer += 0 + ' ';
    }
  }

  console.log(answer);
}
