function solution(n, computers) {
  let answer = 0;
  let visited = [];

  //DFS
  for (let i = 0; i < n; i++) {
    if (!visited[i]) {
      dfs(i, visited, computers);
      answer++;
    }
  }

  function dfs(x, visited, computers) {
    visited[x] = true;

    for (let y = 0; y < computers.length; y++) {
      if (computers[x][y] === 1 && !visited[y]) {
        dfs(y, visited, computers);
      }
    }
  }

  return answer;
}
