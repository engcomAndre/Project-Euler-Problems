function solution(arr, k) {

  var max = 0;

  var dx = [1, 0, 1,-1];
  var dy = [0, 1, 1, 1];

  for (var y = 0; y < arr.length; y++) {
    for (var x = 0; x < arr[y].length; x++) {
      for (var d = 0; d < 4; d++) {
        var p = 1;
        for (var i = 0; i < k; i++) {
          p*= get(arr, y + i * dy[d], x + i * dx[d]);
        }
        max = Math.max(p, max);
      }
    }
  }
  return max;
}

console.log(solution(arr, 4));
