const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

let testCaseNum = +input[0];
let answer = '';

for (let i = 1; i <= testCaseNum; i++) {
  let num = input[i].split(' ');
  const a = +num[0];
  const b = +num[1];
  const result = a + b;
  answer += `Case #${i}: ${a} + ${b} = ${result}\n`;
}

console.log(answer);
