function solution(tickets) {
  let answer = [];
  let visited = new Array(tickets.length).fill(0);

  tickets.sort();

  dfs('ICN', 0, 'ICN');

  function dfs(start, count, route) {
    if (count === tickets.length) {
      answer.push(route);
      return;
    }

    for (let i = 0; i < tickets.length; i++) {
      const ticket = tickets[i];

      if (visited[i] === 0 && ticket[0] === start) {
        visited[i] = 1;
        dfs(ticket[1], count + 1, route + ' ' + ticket[1]);

        visited[i] = 0;
      }
    }
  }

  return answer[0].split(' ');
}
