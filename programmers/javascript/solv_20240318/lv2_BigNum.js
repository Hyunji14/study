function solution(numbers) {
  let answer = numbers
    .map((item) => item + '')
    .sort((a, b) => (b + a) * 1 - (a + b) * 1)
    .join('');

  return answer[0] === '0' ? '0' : answer;
}
