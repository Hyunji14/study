const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [a, b] = fs.readFileSync(filePath).toString().trim().split('\n');
solution(+a, +b);

function solution(a, b) {
  console.log(a * b);
}
