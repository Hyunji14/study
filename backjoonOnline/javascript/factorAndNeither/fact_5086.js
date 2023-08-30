const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

for (let i = 0; i < input.length; i++) {
  let [a, b] = input[i]
    .trim()
    .split(' ')
    .map((item) => +item);
  if (a === 0 && b === 0) {
    break;
  }
  solution(a, b);
}

function solution(a, b) {
  if (b % a === 0) {
    console.log('factor');
  } else if (a % b === 0) {
    console.log('multiple');
  } else {
    console.log('neither');
  }
}
