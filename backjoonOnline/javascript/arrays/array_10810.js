const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().split('\n');

solution(input);

function solution(input) {
  const data = input[0].split(' ').map((item) => +item);
  const n = data[0];
  const m = data[1];
  let answer = '';
  let basket = [];

  for (let i = 0; i < n; i++) {
    basket[i] = 0;
  }

  for (let i = 1; i <= m; i++) {
    let basketInfo = input[i].split(' ').map((item) => +item);
    let start = basketInfo[0] - 1;
    let end = basketInfo[1] - 1;
    let ballNum = basketInfo[2];

    for (let j = start; j <= end; j++) {
      basket[j] = ballNum;
    }
  }

  for (let i = 0; i < basket.length; i++) {
    answer += basket[i] + ' ';
  }

  console.log(answer);
}
