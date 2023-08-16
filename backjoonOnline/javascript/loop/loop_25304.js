const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

solution(input);

function solution(input) {
  const totalCost = +input[0];
  const totalObjectNum = +input[1];
  let listSumResult = 0;

  for (let i = 2; i <= totalObjectNum + 1; ++i) {
    const tempValue = input[i].split(' ').map((item) => +item);

    listSumResult += tempValue[0] * tempValue[1];
  }

  if (totalCost === listSumResult) {
    console.log('Yes');
  } else {
    console.log('No');
  }
}
