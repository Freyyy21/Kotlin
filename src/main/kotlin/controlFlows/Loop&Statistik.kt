package controlFlows

fun main(){

    val number = ArrayList<Int>()
    var angkaGanjil = 0
    var angkaGenap = 0

    while (true){
        print("Masukkan angka = ")
        val input = readln().toIntOrNull() ?: continue

        if (input == 0){
            val jumlah = number.sum()
            val rata2 = if (number.isNotEmpty()) jumlah / number.size else 0

            for (angka in number){
                if (angka % 2 == 0){
                    angkaGenap++
                }else{
                    angkaGanjil++
                }
            }

            println("Jumlah = $jumlah")
            println("Rata-rata = $rata2")
            println("Jumlah angka genap = $angkaGenap")
            println("Jumlah angka ganjil = $angkaGanjil")
            break
        } else {
            number.add(input)
        }
    }
}
