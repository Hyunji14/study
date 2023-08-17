const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

const idx = +input[1];

solution(input[0], idx);

function solution(str, index) {
  console.log(str.charAt(index - 1));
}
