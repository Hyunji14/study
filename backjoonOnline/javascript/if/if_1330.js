const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split(' ');

solution(input[0], input[1]);

function solution(num1, num2) {
  const n1 = Number(num1);
  const n2 = Number(num2);

  if (n1 > n2) {
    console.log('>');
  } else if (n1 < n2) {
    console.log('<');
  } else if (n1 === n2) {
    console.log('==');
  }
}
