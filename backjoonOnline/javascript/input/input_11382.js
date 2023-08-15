const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split(' ');

solution(input);

function solution(input) {
  console.log(Number(input[0]) + Number(input[1]) + Number(input[2]));
}
