function solution(s) {
  let answer = [];
  let map = new Map();

  s.split('').map((item, index) => {
    if (!map.has(item)) {
      answer.push(-1);
      map.set(item, index);
    } else {
      answer.push(index - map.get(item));
      map.set(item, index);
    }
  });

  return answer;
}
