package basic

fun main(){
    print("Masukkan bilangan bulat pertama: ")
    val bilPertama = readln().toInt()
    print("Masukkan bilangan bulat kedua: ")
    val bilKedua = readln().toInt()

    println("Penjumlahan dari $bilPertama dengan $bilKedua adalah ${bilPertama + bilKedua}")
    println("Pengurangan dari $bilPertama dengan $bilKedua adalah ${bilPertama - bilKedua}")
    println("Perkalian dari $bilPertama dengan $bilKedua adalah ${bilPertama * bilKedua}")
    println("Pembagian dari $bilPertama dengan $bilKedua adalah ${bilPertama.toDouble() / bilKedua}")
    println("Sisa bagi dari $bilPertama dengan $bilKedua adalah ${bilPertama % bilKedua}")
}