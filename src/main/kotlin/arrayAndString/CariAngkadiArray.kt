package arrayAndString

fun main(){

    val number = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    while (true){
        print("Masukkan angka yang kamu cari = ")
        val inputAngka = readln().toIntOrNull()

        if (inputAngka != null){
            inner@for (i in number){
                if (number.contains(inputAngka)) {
                    if (i == inputAngka) {
                        val index = number.indexOf(i)
                        println("Angka $inputAngka berada pada index $index")
                        continue
                    }
                }else{
                    println("Angka tidak ditemukan!")
                    break@inner
                }
            }
        }else {
            println("Input tidak valid")
            break
        }

    }

}