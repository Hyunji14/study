const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

const size = +input[0];
const numArray = input[1].split(' ').map((item) => +item);

const findNumber = +input[2];

solution(size, numArray, findNumber);

function solution(size, numArray, findNumber) {
  let result = 0;

  for (let i = 0; i < size; i++) {
    if (numArray[i] === findNumber) result++;
  }

  console.log(result);
}
