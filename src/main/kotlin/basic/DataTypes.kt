package basic

fun main(){
    print("Masukkan umur anda: ")
    val umur = readln().toInt()

    print("Masukkan tinggi badan: ")
    val tinggiBadan = readln().toDouble()

    print("Huruf favorit: ")
    val hurufFavorit = readln()

    println("Status mahasiswa (1/2)")
    println("1. Aktif\n2. Non-Aktif")
    print("Masukkan: ")
    val inputStatus = readln().toInt()

    val status: Boolean= if (inputStatus == 1){
        true
    }else{
        false
    }

    println("Umur: $umur")
    println("Tinggi badan: $tinggiBadan")
    println("Huruf Favorit: $hurufFavorit")
    println("Status Mahasiswa: $status")
}