function solution(cards1, cards2, goal) {
  let answer = 'Yes';
  let result = true;

  for (let i = 0; i < goal.length; i++) {
    let item = goal[i];

    if (cards1.includes(item) && item === cards1[0]) {
      result = true;
      cards1.splice(0, 1);
    } else if (cards2.includes(item) && item === cards2[0]) {
      result = true;
      cards2.splice(0, 1);
    } else {
      result = false;
      break;
    }
  }

  return result ? 'Yes' : 'No';
}
