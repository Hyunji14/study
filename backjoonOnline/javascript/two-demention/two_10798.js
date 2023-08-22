const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

solution(input);

function solution(input) {
  let answer = '';
  let map = {};

  for (let i = 0; i < input.length; i++) {
    let tempStr = input[i].trim();

    for (let j = 0; j < tempStr.length; j++) {
      if (!map.hasOwnProperty(j)) {
        map[j] = tempStr.charAt(j);
      } else {
        map[j] += tempStr.charAt(j);
      }
    }
  }

  for (let key in map) {
    answer += map[key];
  }

  console.log(answer);
}
