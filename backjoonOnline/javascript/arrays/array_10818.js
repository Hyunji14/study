const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

const size = +input[0];
const numArray = input[1].split(' ').map((item) => +item);

solution(size, numArray);

function solution(size, numArray) {
  let max = -1000000;
  let min = 1000000;

  for (let i = 0; i < size; i++) {
    if (numArray[i] < min) {
      min = numArray[i];
    } else if (numArray[i] > max) {
      max = numArray[i];
    }
  }

  console.log(`${min} ${max}`);
}
