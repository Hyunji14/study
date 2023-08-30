const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [a, b, v] = fs.readFileSync(filePath).toString().trim().split(' ');

solution(+a, +b, +v);

function solution(a, b, v) {
  const day = Math.ceil((v - b) / (a - b));
  console.log(day);
}
