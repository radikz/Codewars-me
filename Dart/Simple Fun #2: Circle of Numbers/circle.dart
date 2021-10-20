int circleOfNumbers(int n, int fst) {
  final opposite = (n / 2).round() + fst;
  final res = opposite == n 
    ? 0 
    : opposite > n 
      ? opposite - n 
      : opposite;
  return res;
}