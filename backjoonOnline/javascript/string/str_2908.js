const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split(' ');

solution(input);

function solution(input) {
  const testArray = [];
  let answer = 0;

  for (let i = 0; i < input.length; i++) {
    let tempStr = input[i];
    let num = '';

    for (let j = tempStr - 1; j >= 0; j--) {
      num += tempStr.charAt(j);
    }

    testArray.push(+num);
  }

  answer = testArray[0] > testArray[1] ? testArray[0] : testArray[1];

  console.log(answer);
}
