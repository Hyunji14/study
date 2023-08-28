const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs.readFileSync(filePath).toString().trim().split('\n');

const testCase = +input.shift();
let testArr = input.map((item) => +item);

solution1(testCase, testArr);
// solution2(testCase, testArr);

function solution1(testCase, testArr) {
  let answer = '';
  const coins = [25, 10, 5, 1];
  let result = [0, 0, 0, 0];
  let money;

  for (let i = 0; i < testCase; i++) {
    money = testArr[i];

    for (let i = 0; i < coins.length; i++) {
      if (money >= coins[i]) {
        result[i] = Math.floor(money / coins[i]);
        money = money % coins[i];
      }
    }

    answer += `${result[0]} ${result[1]} ${result[2]} ${result[3]}\n`;
  }

  console.log(answer);
}

function solution2(testCase, testArr) {
  const coins = [25, 10, 5, 1];

  testArr.forEach((money) => {
    let result = [0, 0, 0, 0];

    for (let i = 0; i < coins.length; i++) {
      if (money >= coins[i]) {
        result[i] = Math.floor(money / coins[i]);
        money = money % coins[i];
      }
    }

    console.log(result.join(' '));
  });
}
