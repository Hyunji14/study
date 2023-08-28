const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim();

solution1(+input);

function solution1(num) {
  let dots = 2;

  // 규칙성을 보았을 때,
  // (이전 점의 개수 + 2 ** 점을 찍은 횟수) 의 제곱으로 나타남
  // 사각형이 1개일 때, 점의 개수가 4이므로 초기 값은 2.
  // 시작은 2부터, (이전 index + 현재 index)를 주어진 입력값 만큼 하고
  for (let i = 0; i < num; i++) {
    dots += Math.pow(2, i);
  }
  // 제곱을 해주면 됨
  console.log(Math.pow(dots, 2));
}
