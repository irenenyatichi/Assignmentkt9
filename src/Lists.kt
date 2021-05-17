fun main() {
    println(names(listOf("Jane","Jacky","Joseph","Joyce","Julius","Josephine","Justus","Janet","Julietta","Jacob")))
    println(individualHeight(listOf(5,6,7,8,9)))
    var person= mutableListOf(
        Person("Jane", 14, 4.0,30),
        Person("Paul", 32,6.5,60),
        Person("Adrian", 16, 5.2, 49),
        Person("Mercy", 25, 6.2, 55)
    )
    val descending = person.sortedByDescending { Person -> Person.age}
    println(descending)

    val cars= mutableListOf<Cars>(
        Cars("kcf654j",50000),
        Cars("zwx",250000)
    )
    println(carList(cars))
}

fun names(name:List<String>): MutableList<String> {
    val jina= mutableListOf<String>()
    for (x in name) {
        if (name.indexOf(x) % 2 == 0) {
            jina.add(x) }
    }
    return jina
}

fun individualHeight(height: List<Int>): Pair<Int,Double> {
        val total = height.sum()
        val avg = height.average()
        return(Pair(total,avg))
    }

data class Person(var name: String, var age: Int, var height:Double, var weight:Int)
fun sorting(person:MutableList<Person>){
    var person= mutableListOf(
        Person("Jane", 14, 4.0,30),
        Person("Paul", 32,6.5,60),
        Person("Adrian", 16, 5.2, 49),
        Person("Mercy", 25, 6.2, 55)
    )

data class Person(var name: String, var age: Int, var height:Double, var weight:Int)
fun person(){
        var person= mutableListOf(
            Person("Jane", 14, 4.0,30),
            Person("Paul", 32,6.5,60),
            Person("Adrian", 16, 5.2, 49),
            Person("Mercy", 25, 6.2, 55)
        )
        person.addAll( mutableListOf(
            Person("Florence",20,5.8,62),
            Person("Kevin",35,6.1,65)
        ) )
        println(person)}}

data class Cars(var registration:String,var mileage:Int)
fun carList(cars: List<Cars>): Int {
    var total = 0
    for (car in cars){
        total += car.mileage
    }
    val average = total/cars.count()
    return average
}