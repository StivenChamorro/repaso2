package org.example

fun main(){
    var favoriteActor: String? = "sandra oh"
//    println(favoriteActor!!.length)
//    val lengthOfName = if (favoriteActor != null){
//        favoriteActor.length
//        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
//    }else {
//        0
//        println("You didn't input a name.")
//    }
    val lengthOfName = favoriteActor?.length?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")

//    var number: Int? = 10
//    println(number)
//
//    number = null
//    println(number)

}
