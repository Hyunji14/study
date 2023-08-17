const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

const testCaseNum = +input[0];
const testArray = [];

for (let i = 1; i <= testCaseNum; i++) {
  testArray.push(input[i].trim());
}

solution(testArray);

function solution(testArray) {
  for (let i = 0; i < testArray.length; i++) {
    console.log(
      `${testArray[i].charAt(0)}${testArray[i].charAt(testArray[i].length - 1)}`
    );
  }
}
