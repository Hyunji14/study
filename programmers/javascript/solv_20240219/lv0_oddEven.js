function solution(num_list) {
  let odd = 0;
  let even = 0;

  num_list.map((item, index) => {
    if ((index + 1) % 2 === 0) {
      even += item;
    } else {
      odd += item;
    }
  });

  return odd > even ? odd : even;
}

console.log(solution([4, 2, 6, 1, 7, 6]));
console.log(solution([-1, 2, 5, 6, 3]));
