const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const x = fs.readFileSync(filePath).toString().trim();

solution(+x);

function solution(x) {
  let line = 0;
  let lineSum = 0;

  for (let i = 1; lineSum < x; i++) {
    line = i;
    if (lineSum + i < x) {
      lineSum += line;
    } else {
      break;
    }
  }

  let idx = x - lineSum;

  if (line % 2 === 0) {
    console.log(`${idx}/${line + 1 - idx}`);
  } else {
    console.log(`${line + 1 - idx}/${idx}`);
  }
}
