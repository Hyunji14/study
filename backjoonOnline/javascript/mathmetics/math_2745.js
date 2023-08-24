const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [b, radix] = fs.readFileSync(filePath).toString().trim().split(' ');

solution(b, radix);

function solution(b, n) {
  console.log(parseInt(b, n));
}
