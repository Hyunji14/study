const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().trim();

solution(input);

function solution(input) {
  const inputByte = Math.floor(+input / 4);
  const typeString = 'long ';
  let resultString = '';

  for (let i = 0; i < inputByte; ++i) {
    resultString += typeString;
  }

  console.log(`${resultString}int`);
}
