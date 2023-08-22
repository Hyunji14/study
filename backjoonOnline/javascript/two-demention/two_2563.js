const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

solution(input);

function solution(input) {
  const num = +input.shift().trim();
  let paper = new Array(100).fill().map((item) => new Array(100).fill(false));

  for (let i = 0; i < num; i++) {
    let tempStr = input[i]
      .trim()
      .split(' ')
      .map((item) => +item);

    for (let j = 0; j < 10; j++) {
      for (let k = 0; k < 10; k++) {
        paper[j + tempStr[0]][k + tempStr[1]] = true;
      }
    }
  }

  let answer = paper.reduce((count, black) => {
    for (let b of black) {
      if (b) count++;
    }
    return count;
  }, 0);

  console.log(answer);
}
