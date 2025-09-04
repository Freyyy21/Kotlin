package basic

fun main(){
    print("Masukkan angka pertama: ")
    val firstNum = readln().toInt()
    print("Masukkan angka kedua: ")
    val secNum = readln().toInt()
    print("Masukkan operator: ")
    val operator = readln()

    val result = when(operator){
        "+" -> (firstNum + secNum)
        "-" -> (firstNum - secNum)
        "*" -> (firstNum * secNum)
        "/" -> if (secNum != 0){
            (firstNum.toDouble() / secNum)
        }else{
            ("error")
        }
        else -> print("Input tidak valid")
    }
    print("$firstNum $operator $secNum = $result")
}