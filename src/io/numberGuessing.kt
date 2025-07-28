package io

import java.util.Random

fun main() {
    val number = Random().nextInt(100)

    var input: String?
    var guess = -1

    while(guess!=number){
        print("Enter a number: ")
        input = readLine()
        if(input==null){
            continue
        }
        guess = input.toInt()
        if(guess<number){
            println("Too low")
        }else if(guess>number){
            println("Too high")
        }
    }

    println("You guessed it!")

}