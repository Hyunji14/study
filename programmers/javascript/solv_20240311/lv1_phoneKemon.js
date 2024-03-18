function solution(nums) {
  let answer = 0;
  let s = new Set();
  let n = Math.floor(nums.length / 2);

  nums.map((item) => {
    s.add(item);
  });

  if (s.size > n) {
    answer = n;
  } else {
    answer = s.size;
  }

  return answer;
}
