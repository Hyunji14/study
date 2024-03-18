function solution(arr) {
  let oldArr = arr;
  let x = 1;

  while (true) {
    let newArr = oldArr.map((item) => {
      if (item >= 50 && item % 2 === 0) {
        return Math.floor(item / 2);
      }
      if (item < 50 && item % 2 !== 0) {
        return item * 2 + 1;
      } else {
        return item;
      }
    });

    if (oldArr.toString() === newArr.toString()) {
      return x - 1;
    }

    x++;
    oldArr = newArr;
  }
}

console.log(solution([1, 2, 3, 100, 99, 98]));
