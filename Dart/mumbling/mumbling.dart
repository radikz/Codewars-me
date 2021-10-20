String accum(String str) {
  final split = str.split("");
  String res = "";
  for (var i = 0; i < split.length; i++){
    for (var j = 0; j <= i; j++){
     if (j == 0) {
       print(split[i].toUpperCase());
       res += split[i].toUpperCase();
     } else {
       print(split[i].toLowerCase());
       res += split[i].toLowerCase();
     }
    }
    if (i < split.length - 1){
      res += "-";  
    }
    
  }
  return res;
}