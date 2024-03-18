function solution(s, skip, index) {
  let answer = '';
  const skipBook = skip.split('').map((item) => item.charCodeAt());

  s.split('').map((item) => {
    let asc = item.charCodeAt();

    for (let i = 0; i < index; i++) {
      asc += 1;

      if (asc > 122) {
        asc -= 26;
      }

      while (skipBook.includes(asc)) {
        asc += 1;

        if (asc > 122) {
          asc -= 26;
        }
      }
    }

    answer += String.fromCharCode(asc);
  });

  return answer;
}
