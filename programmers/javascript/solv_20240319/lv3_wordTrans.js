function solution(begin, target, words) {
  let visited = [];
  let queue = [];

  if (!words.includes(target)) return 0;

  queue.push([begin, 0]);

  while (queue.length) {
    let [result, count] = queue.shift();

    if (result === target) return count;

    words.forEach((word) => {
      if (!visited.includes(word)) {
        let equalCount = 0;

        for (let i = 0; i < word.length; i++) {
          if (word[i] !== result[i]) equalCount += 1;
        }

        if (equalCount === 1) {
          queue.push([word, ++count]);
          visited.push(word);
        }
      }
    });
  }

  return answer;
}
function solution(begin, target, words) {
  let visited = [];
  let queue = [];

  if (!words.includes(target)) return 0;

  queue.push([begin, 0]);

  while (queue.length) {
    let [result, count] = queue.shift();

    if (result === target) return count;

    words.forEach((word) => {
      if (!visited.includes(word)) {
        let equalCount = 0;

        for (let i = 0; i < word.length; i++) {
          if (word[i] !== result[i]) equalCount += 1;
        }

        if (equalCount === 1) {
          queue.push([word, ++count]);
          visited.push(word);
        }
      }
    });
  }

  return answer;
}
