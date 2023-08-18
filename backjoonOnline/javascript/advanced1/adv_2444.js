const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim();

solution(+input);

function solution(input) {
  // 정방향
  for (let i = 0; i < input - 1; i++) {
    let star = '*'.repeat(2 * i + 1);
    let space = ' '.repeat(input - i);

    console.log(space + star);
  }

  //역방향
  for (let i = input - 1; i >= 0; i--) {
    let star = '*'.repeat(2 * i + 1);
    let space = ' '.repeat(input - i);
    console.log(space + star);
  }
}
