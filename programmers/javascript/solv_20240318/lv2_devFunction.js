function solution(progresses, speeds) {
  let answer = [];
  let queue = [];
  let i = 0;

  progresses.map((p, index) => {
    let day = Math.ceil((100 - p) / speeds[index]);

    if (queue.length === 0) {
      queue.push(day);
      answer.push(1);
    } else {
      if (queue[0] >= day) {
        answer[i] += 1;
      } else {
        queue.shift();
        queue.push(day);
        answer.push(1);
        i += 1;
      }
    }
  });

  return answer;
}
