function solution(wallpaper) {
  let answer = [];
  let xList = [];
  let yList = [];

  wallpaper.map((w, x) => {
    const tmp = w.split('');

    tmp.map((s, y) => {
      if (s === '#') {
        xList.push(x);
        yList.push(y);
      }
    });
  });

  //start
  answer.push(Math.min(...xList));
  answer.push(Math.min(...yList));

  //end
  answer.push(Math.max(...xList) + 1);
  answer.push(Math.max(...yList) + 1);

  return answer;
}
