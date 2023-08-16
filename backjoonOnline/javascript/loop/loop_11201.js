const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

let testCaseNum = +input[0];
let answer = '';

for (let i = 1; i <= testCaseNum; i++) {
  let num = input[i].split(' ');
  const result = Number(num[0]) + Number(num[1]);
  answer += `Case #${i}: ${result}\n`;
}

console.log(answer);
