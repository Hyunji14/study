const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const num = fs.readFileSync(filePath).toString().trim().split('\n');

console.log(+num);
console.log(1);
