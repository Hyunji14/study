const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

solution(input);

function solution(input) {
  const [n, m] = input
    .shift()
    .split(' ')
    .map((item) => +item);

  let arrA = [];
  let arrB = [];
  let resultArr = [];
  let answer = '';

  for (let i = 0; i < input.length; i++) {
    let tempArr = input[i]
      .trim()
      .split(' ')
      .map((item) => +item);

    if (i < n) {
      arrA.push(tempArr);
    } else {
      arrB.push(tempArr);
    }
  }

  for (let i = 0; i < n; i++) {
    let tmp = [];
    for (let j = 0; j < m; j++) {
      tmp[j] = arrA[i][j] + arrB[i][j];
    }

    resultArr.push(tmp);
  }

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < m; j++) {
      answer += `${resultArr[i][j]} `;
    }

    if (i < n - 1) {
      answer += '\n';
    }
  }

  console.log(answer);
}
