const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let num = fs.readFileSync(filePath).toString().trim().split('\n');

num = BigInt(num);

console.log(`${num * num * num}`);
console.log(3);
