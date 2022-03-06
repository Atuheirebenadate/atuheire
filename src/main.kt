fun main(){
    them("benadate","joan","sandra","babra")
    places()
    numb()
    numb()
    numb()
    var p = gals("peter","jane","susan")
    println(p.contentToString())




}
fun them(name:String,nameA:String,nameB:String, nameC:String){
    var result= arrayOf(name,nameA, nameB,nameC)
    println(result.contentToString())
}
fun places(){
    var cities= arrayOf("herare","mumbai","dodoma","jakarta")
    var call=cities.sortedArray()
    var arranged=call.forEach { city->
        println(city.capitalize())


    }
}
fun numb(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var two= arrayOf(numbers[1],numbers[4])
    println(two.sum())
    println(numbers.indexOf(158))
    println(numbers.sorted())
}
fun gals(name1:String,name2:String,name3:String):Array<String>{
    var nam = arrayOf(name1, name2, name3)
    return nam
}