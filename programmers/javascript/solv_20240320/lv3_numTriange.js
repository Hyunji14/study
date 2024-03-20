function solution(triangle) {
  const size = triangle.length - 1;

  for (let i = size; i > 0; i--) {
    for (let j = 0; j < triangle[i].length; j++) {
      triangle[i - 1][j] +=
        triangle[i][j] > triangle[i][j + 1]
          ? triangle[i][j]
          : triangle[i][j + 1];
    }
  }
  return triangle[0][0];
}
