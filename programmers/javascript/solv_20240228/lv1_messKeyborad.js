function solution(keymap, targets) {
  let answer = [];
  let map = new Map();

  keymap.map((item) => {
    const list = item.split('');
    list.map((k, i) => {
      if (!map.has(k) || (map.has(k) && i + 1 <= map.get(k))) {
        map.set(k, i + 1);
      }
    });
  });

  targets.map((item) => {
    const tmp = item.split('');
    let count = 0;

    for (let i = 0; i < tmp.length; i++) {
      if (!map.has(tmp[i])) {
        count = -1;
        break;
      }
      count += map.get(tmp[i]);
    }
    answer.push(count);
  });

  return answer;
}
