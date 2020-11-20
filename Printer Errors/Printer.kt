fun printerError(s: String): String {
    val letters = ("a,b,c,d,e,f,g,h,i,j,k,l,m").split(",")
    val a = s.length
    var count = 0
    var index = 0
    println(letters)
    
       
    while (index < s.length){
        for (letter in letters){
            if (Character.toString(s[index]).contains(letter)){
                count += 1
            }
        }
        index += 1
    }    
    return "${a-count}/$a"
    
}
