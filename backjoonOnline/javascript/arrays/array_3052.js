const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split('\n')
  .map((item) => +item);

solution(input);

function solution(list) {
  let remainList = [];

  for (let i = 0; i < list.length; i++) {
    let remainNum = list[i] % 42;
    if (remainList.length === 0) {
      remainList.push(remainNum);
    } else if (!remainList.includes(remainNum)) {
      remainList.push(remainNum);
    }
  }

  console.log(remainList.length);
}
