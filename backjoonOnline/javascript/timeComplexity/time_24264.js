const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let num = fs.readFileSync(filePath).toString().trim().split('\n');

console.log((+num) ** 2);
console.log(2);
