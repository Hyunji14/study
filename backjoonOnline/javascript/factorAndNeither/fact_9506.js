const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const number = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split('\n')
  .map((item) => +item);

number.forEach((item) => {
  if (+item !== -1) {
    solution(+item);
  }
});

function solution(number) {
  let factors = [];
  let sum = 0;

  for (let i = 1; i <= number; i++) {
    if (number % i === 0) {
      if (i !== number) {
        factors.push(i);
        sum += i;
      }
    }
  }

  if (sum === number) {
    console.log(`${number} = ${factors.join(' + ')}`);
  } else {
    console.log(`${number} is NOT perfect.`);
  }
}
