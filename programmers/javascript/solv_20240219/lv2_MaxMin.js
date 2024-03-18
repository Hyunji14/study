function solution(s) {
  let answer = '';
  const tmp = s.split(' ').map((item) => Number(item));
  answer = `${Math.min(...tmp)} ${Math.max(...tmp)}`;

  return answer;
}

console.log(solution('1 2 3 4'));
console.log(solution('-1 -2 -3 -4'));
console.log(solution('-1 -1'));
