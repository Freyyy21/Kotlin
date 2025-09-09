package controlFlows

fun main(){
    println("Masukkan jumlah baris: ")
    val totalBaris = readln().toInt()
    for (i in 1..totalBaris){
        for (s in 1..(totalBaris-i)){
            print(" ")
        }
        for (n in 1..i){
            print(n)
        }
        for (n in (i-1) downTo 1){
            print(n)
        }
        println()
    }



}