const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs
  .readFileSync(filePath)
  .toString()
  .split('\n')
  .map((item) => +item);

solution(input);

function solution(attend) {
  for (let i = 1; i < 31; i++) {
    if (!attend.includes(i)) {
      console.log(i);
    }
  }
}
