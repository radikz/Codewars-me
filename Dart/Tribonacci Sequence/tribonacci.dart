List<num> tribonacci(List<num> signature, int n) {
  if (n == 0){
    // return empty
    return [];
  } else if(n >= 1 && n <= 3) {
    //take first n
    return signature.take(n).toList();
  }
  return recursive(signature, n);
}

List<num> recursive(List<num> signature, int n, {List<num>? temp}){
  
  // reverse the list to get the last 3 as the first 3
  List<num> res = temp == null 
    ? signature.reversed.toList() 
    : temp.reversed.toList();
  
  // take first 3
  final take3 = res.take(3);
  
  //sum the first 3
  final sum = take3.reduce((prev, curr) => prev + curr);
  
  if (res.length < n){
    // reverse back
    final reverse = res.reversed.toList();
    
    // add the sum to the latest array
    reverse.add(sum);
    
    //recursive the func
    return recursive(signature, n, temp: reverse);
  }
  return temp!;
}