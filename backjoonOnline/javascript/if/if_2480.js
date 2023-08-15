const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const data = fs.readFileSync(filePath).toString().trim();

const numbers = data.split(' ').map((item) => +item);

solution(numbers[0], numbers[1], numbers[2]);

function solution(n1, n2, n3) {
  let result = 0;

  if (n1 === n2 && n1 === n3) {
    result = 10000 + n1 * 1000;
  } else if (n1 === n2 || n1 === n3) {
    result = 1000 + n1 * 100;
  } else if (n2 === n3) {
    result = 1000 + n2 * 100;
  } else {
    result = Math.max(n1, n2, n3) * 100;
  }

  console.log(`${result}`);
}
