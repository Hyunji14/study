const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [x, y, w, h] = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split(' ')
  .map((item) => +item);

solution(x, y, w, h);

function solution(x, y, w, h) {
  let answer = [];

  answer.push(Math.abs(x));
  answer.push(Math.abs(x - w));
  answer.push(Math.abs(y));
  answer.push(Math.abs(y - h));

  answer.sort((a, b) => a - b);

  console.log(answer[0]);
}
