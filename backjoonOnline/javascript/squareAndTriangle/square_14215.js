const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const arr = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split(' ')
  .map((item) => +item);

console.log(solution(arr));

function solution(arr) {
  let answer = 0;
  arr.sort((a, b) => a - b);

  const a = arr[0];
  const b = arr[1];
  const c = arr[2];

  if (c < a + b) {
    answer = a + b + c;
  } else {
    answer = (a + b) * 2 - 1;
  }

  return answer;
}
