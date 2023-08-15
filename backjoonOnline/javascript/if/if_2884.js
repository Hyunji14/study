const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

input = input[0];
input = input.split(' ').map((item) => +item);

solution(input[0], input[1]);

function solution(h, m) {
  let hour = h;
  let min = m - 45;

  if (min < 0) {
    if (hour === 0) {
      hour = 23;
    } else {
      hour--;
    }
    min = 60 - Math.abs(min);
  }

  console.log(`${hour} ${min}`);
}
