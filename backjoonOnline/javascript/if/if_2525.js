const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const data = fs.readFileSync(filePath).toString().split('\n');

const currentClock = data[0].split(' ').map((item) => +item);

solution(currentClock[0], currentClock[1], +data[1]);

function solution(currentHour, currentMin, clock) {
  const totalMin = currentHour * 60 + currentMin + clock;
  let h = Math.floor(totalMin / 60);
  let m = totalMin % 60;

  if (h >= 24) {
    h -= 24;
  }

  console.log(`${h} ${m}`);
}
