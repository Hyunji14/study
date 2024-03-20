function solution(n, works) {
  let totalWork = works.reduce((total, curr) => total + curr, 0);

  if (totalWork <= n) return 0;

  let sorted = works.sort((a, b) => b - a);

  while (n) {
    let max = sorted[0];

    for (let i = 0; i < sorted.length; i++) {
      if (sorted[i] >= max) {
        sorted[i] -= 1;
        n -= 1;
      }
      if (!n) break;
    }
  }

  return works.reduce((total, curr) => (total += Math.pow(curr, 2)), 0);
}
