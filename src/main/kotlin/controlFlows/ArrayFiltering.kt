package controlFlows

fun main(){

    val number = ArrayList<Int>()
    outer@while (true){
            for (i in 0..number.size) {
                print("Masukkan angka = ")
                val input = readln().toIntOrNull()
                if (input != null){
                    number.add(input)
                }else{
                    println("Input tidak valid! Masukkan angka")
                }
                if (number.size == 10){
                    break@outer
                }
            }
    }

    outer@for (i in number.indices){
        println(i)
        if (number[i] > 50){
            continue@outer
        }
    }
}