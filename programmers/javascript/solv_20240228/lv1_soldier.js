function solution(number, limit, power) {
  let answer = 0;
  let list = [];

  list.map((item) => {
    if (item <= limit) {
      answer += item;
    } else {
      answer += power;
    }
  });

  return answer;
}
