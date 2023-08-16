const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs
  .readFileSync(filePath)
  .toString()
  .split('\n')
  .map((item) => +item);

solution(input);

function solution(numArray) {
  let idx = 0;
  let max = -1;

  for (let i = 0; i < numArray.length; i++) {
    if (numArray[i] >= max) {
      max = numArray[i];
      idx = i + 1;
    }
  }

  console.log(`${max}\n${idx}`);
}
