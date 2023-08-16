const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

const testCaseArray = [];
for (let i = 0; ; ++i) {
  const tempValue = input[i].split(' ').map((item) => +item);
  testCaseArray.push({ A: tempValue[0], B: tempValue[1] });
  if (tempValue[0] === 0 && tempValue[1] === 0) {
    break;
  }
}

solution(testCaseArray);

function solution(testCaseArray) {
  let a = testCaseArray[0].A;
  let b = testCaseArray[0].B;
  let idx = 1;

  while (a !== 0 || b !== 0) {
    console.log(a + b);
    a = testCaseArray[idx].A;
    b = testCaseArray[idx].B;
    idx++;
  }
}
