const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const num = fs.readFileSync(filePath).toString().trim().split('\n');

const result = (BigInt(num - 2) * BigInt(num - 1) * BigInt(num)) / BigInt(6);

console.log(`${result}`);
console.log(3);
