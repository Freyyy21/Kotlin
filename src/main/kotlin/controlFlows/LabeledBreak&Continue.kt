package controlFlows

fun main(){

    outer@ for (i in 1..5){
        inner@ for (j in 1..5) {
            if ((i + j) % 4 == 0) {
                continue@inner
            }
            if (i == 4 && j == 4) {
                break@outer
            }
            print("[$i,$j]")
        }
    }
}