package arrayAndString

fun main() {
    val number = ArrayList<Int>()

    while (true) {
        print("Masukkan angka (selain angka untuk berhenti) = ")
        val inputNumber = readln().toIntOrNull() ?: break
        number.add(inputNumber)
    }

    val angkaGenap = number.count { it % 2 == 0 }
    val angkaGanjil = number.count { it % 2 != 0 }

    println("Jumlah bilangan genap = $angkaGenap")
    println("Jumlah bilangan ganjil = $angkaGanjil")
}
