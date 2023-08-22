const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split('\n')
  .map((line) => line.split(' ').map((item) => +item));

solution(input);

function solution(input) {
  let max = -1;
  let x = 0;
  let y = 0;

  for (let i = 0; i < 9; i++) {
    for (let j = 0; j < 9; j++) {
      let value = input[i][j];
      if (value >= max) {
        max = value;
        x = i + 1;
        y = j + 1;
      }
    }
  }

  console.log(max);
  console.log(`${x} ${y}`);
}
