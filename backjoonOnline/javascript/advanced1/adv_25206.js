const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = fs
  .readFileSync(filePath)
  .toString()
  .trim()
  .split('\n')
  .map((item) => item.split(' '));

solution(input);

function solution(input) {
  let totalGrade = 0;
  let majorGrade = 0;
  const degree = {
    'A+': 4.5,
    A0: 4.0,
    'B+': 3.5,
    B0: 3.0,
    'C+': 2.5,
    C0: 2.0,
    'D+': 1.5,
    D0: 1.0,
    F: 0.0,
  };

  for (let [sub, score, grade] of input) {
    if (grade === 'P') {
      continue;
    } else {
      totalGrade += +score;
      majorGrade += +score * degree[grade.trim()];
    }
  }

  console.log(majorGrade / totalGrade);
}
