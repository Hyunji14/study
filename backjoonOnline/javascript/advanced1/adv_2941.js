const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim();

solution(input);

function solution(input) {
  let str = input;
  const alpha = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z='];

  for (let cro of alpha) {
    str = str.split(cro).join('!');
  }

  console.log(str.length);
}
