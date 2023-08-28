const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim();

solution(+input);

function solution(input) {
  let roomCount = 1;
  let number = 1;

  while (number < input) {
    number += 6 * roomCount;

    roomCount++;
  }

  console.log(roomCount);
}
