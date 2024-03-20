function solution(operations) {
  let queue = [];

  operations.map((operator) => {
    const [op, num] = operator.split(' ');

    if (op === 'I') {
      queue.push(+num);
      queue.sort((a, b) => a - b);
    }
    if (op === 'D' && queue.length > 0) {
      if (num === '-1') {
        queue.shift();
      } else {
        queue.pop();
      }
    }
  });

  return queue.length > 0 ? [queue[queue.length - 1], queue[0]] : [0, 0];
}
