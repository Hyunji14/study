const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim();

solution(input);

function solution(input) {
  let str = input.toUpperCase();
  let count = 0;
  let answer = '';
  let strArr = [];

  for (let i = 0; i < str.length; i++) {
    let alpha = str[i];
    if (!strArr[alpha]) {
      strArr[alpha] = 1;
    } else {
      strArr[alpha]++;
    }
  }

  for (a in strArr) {
    if (strArr[a] > count) {
      count = strArr[a];
      answer = a;
    } else if (strArr[a] === count) {
      answer = '?';
    }
  }

  console.log(answer);
}
