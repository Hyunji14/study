const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().split('\n');

solution(input);

function solution(input) {
  const num = +input[0];
  let result = 0;

  for (let i = 1; i <= num; i++) {
    // 각 줄 입력 string
    let str = input[i].trim();
    let checkGroupWord = true;
    let strArr = [];
    let prevChar = str.charAt(0);

    strArr.push(str.charAt(0));

    for (let j = 1; j < str.length; j++) {
      let currChar = str.charAt(j);

      if (!strArr.includes(currChar)) {
        strArr.push(currChar);
        prevChar = currChar;
      } else {
        if (prevChar !== currChar) {
          checkGroupWord = false;
          break;
        } else {
          prevChar = currChar;
        }
      }
    }

    if (checkGroupWord) result++;
  }

  console.log(result);
}
