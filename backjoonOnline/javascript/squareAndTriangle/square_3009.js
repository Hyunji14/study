const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const array = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split('\n')
  .map((item) =>
    item
      .trim()
      .split(' ')
      .map((item) => +item)
  );

solution(array);

function solution(array) {
  let x = array.map((item) => item[0]).sort((a, b) => a - b);
  let y = array.map((item) => item[1]).sort((a, b) => a - b);

  x = x[0] === x[1] ? x[2] : x[0];
  y = y[0] === y[1] ? y[2] : y[0];

  console.log(x, y);
}
