package controlFlows

import java.util.InputMismatchException

fun main(){
    var number = ArrayList<Int>()
    var valid = 0

    do {
        try {
            var userInput: Int
            print("Masukkan angka positif: ")
            userInput = readln().toInt()

            if (userInput > 0){
                number.add(userInput)
                valid++
            }else{
                println("Angka harus positif!")
            }

        }catch (e: NumberFormatException){
            println("Input tidak valid!")
        }

    }while (valid < 5)

    val maxValue = number.maxOrNull()
    val minValue = number.minOrNull()
    println("Angka terbesar adalah $maxValue")
    println("Angka terkecil adalah $minValue")

}