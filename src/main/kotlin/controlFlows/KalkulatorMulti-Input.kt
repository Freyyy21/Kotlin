package controlFlows

fun main(){
    println("(X ? Y ) ? Z = ")
    print("Masukkan nilai X = ")
    val x = readln().toInt()
    print("Masukkan operator pertama = ")
    val op1 = readln()
    print("Masukkan nilai Y = ")
    val y = readln().toInt()
    print("Masukkan operator kedua = ")
    val op2 = readln()
    print("Masukkan nilai Z = ")
    val z = readln().toInt()

    val temp = when(op1){
        "+" -> x + y
        "-" -> x - y
        "*" -> x * y
        "/" -> if (y == 0){
            println("Undefinied")
            return
        }else{
            x / y
        }

        else -> {
            println("Operator tidak valid!")
            return
        }
    }

    val result = when(op2){
        "+" -> temp + z
        "-" -> temp - z
        "*" -> temp * z
        "/" -> if (z == 0){
            println("Undefinied")
            return
        }else{
            temp / z
        }
        else -> {
            print("Operator tidak valid!")
            return
        }
    }

    println(result)


}