package org.example

fun main() {
    //condicionales
    //println(1 == 1);//expresion booleana

    val trafficLightColor = "Amber"
    val x: Any = 20

//Sentencia if-else if
//    if (trafficLightColor == "Red") {
//        println("Stop")
//    } else if (trafficLightColor == "Yellow"){
//        println("slow")
//    }
//    else if(trafficLightColor == "Green"){
//        println("Go")
//    }else {
//        println("Invalid traffic-light color")
//    }

//    val message =
//        if (trafficLightColor == "Red") "Stop"
//        else if (trafficLightColor == "Yellow") "Slow"
//        else if (trafficLightColor == "Green") "Go"
//        else "Invalid traffic-light color"
//
//    println(message)

    val message = when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
    println(message)

//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        is Int -> println("x is an integer number, but not between 1 and 10.")
//        else -> println("x isn't an integer number.")
//    }

}