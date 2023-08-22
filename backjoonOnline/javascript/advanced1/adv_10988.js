const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim();

solution(input);

function solution(input) {
  let reversStr = '';

  for (let i = input.length - 1; i >= 0; i--) {
    reversStr += input[i];
  }

  if (input === reversStr) {
    console.log(1);
  } else {
    console.log(0);
  }
}
