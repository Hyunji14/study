const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

solution(input[0], input[1]);

function solution(num1, num2) {
  console.log(num1 * num2[2]);
  console.log(num1 * num2[1]);
  console.log(num1 * num2[0]);
  console.log(num1 * num2);
}
