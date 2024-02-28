function solution(todo_list, finished) {
  let answer = [];

  finished.map((item, index) => {
    if (!item) {
      answer.push(todo_list[index]);
    }
  });

  return answer;
}
