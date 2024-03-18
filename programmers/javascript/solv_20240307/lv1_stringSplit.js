function solution(s) {
  let answer = 0;
  let list = s.split('');
  let sameStr = 0;
  let diffStr = 0;
  let x = '';

  list.map((item) => {
    if (x === '') {
      x = item;
      sameStr += 1;
    } else if (x === item) {
      sameStr += 1;
    } else {
      diffStr += 1;
    }

    if (sameStr === diffStr) {
      answer += 1;
      sameStr = 0;
      diffStr = 0;
      x = '';
    }
  });

  if (sameStr !== 0 || diffStr !== 0) {
    answer += 1;
  }

  return answer;
}
