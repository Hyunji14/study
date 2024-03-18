function solution(name, yearning, photo) {
  let answer = [];

  for (p of photo) {
    let count = 0;
    p.map((person) => {
      if (name.includes(person)) {
        count += yearning[name.indexOf(person)];
      }
    });
    answer.push(count);
  }

  return answer;
}
