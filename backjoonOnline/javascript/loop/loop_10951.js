const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

const testCaseArray = [];
for (let i = 0; i < input.length; ++i) {
  if (input[i] === '') {
    break;
  }

  const tempValue = input[i].split(' ').map((item) => +item);

  testCaseArray.push({ A: tempValue[0], B: tempValue[1] });
}

solution(testCaseArray);

function solution(testCaseArray) {
  let a = 0;
  let b = 0;
  let idx = 0;

  while (idx < testCaseArray.length) {
    a = testCaseArray[idx].A;
    b = testCaseArray[idx].B;

    console.log(a + b);

    idx++;
  }
}
