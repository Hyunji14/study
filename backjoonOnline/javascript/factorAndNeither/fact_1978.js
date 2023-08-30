const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

const n = +input.shift();

const arr = input[0].split(' ').map((item) => +item);

solution(n, arr);

function solution(n, arr) {
  let answer = 0;

  for (let i = 0; i < n; i++) {
    let number = arr[i];

    if (number === 1) {
      continue;
    } else {
      let count = 0;

      for (let j = 2; j < number; j++) {
        if (number % j === 0) {
          count++;
        }
      }
      if (count === 0) answer++;
    }
  }

  console.log(answer);
}
