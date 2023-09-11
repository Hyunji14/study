const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs
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

input.forEach((item) => {
  if (item[0] === 0 && item[2] === 0) {
    return;
  } else {
    console.log(solution(item));
  }
});

function solution(item) {
  let answer = '';
  item.sort((a, b) => a - b);
  const a = item[0];
  const b = item[1];
  const c = item[2];

  if (c >= a + b) {
    answer = 'Invalid';
  } else if (a === b && b === c) {
    answer = 'Equilateral';
  } else if (a === b || b === c) {
    answer = 'Isosceles';
  } else {
    answer = 'Scalene';
  }

  return answer;
}
