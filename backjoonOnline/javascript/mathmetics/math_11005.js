const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const [num, radix] = fs.readFileSync(filePath).toString().trim().split(' ');

solution(+num, +radix);

function solution(num, radix) {
  console.log(num.toString(radix).toUpperCase());
}
