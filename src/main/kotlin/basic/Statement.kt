package basic

fun main(){
    print("Masukkan nilai ujian (0 - 100): ")
    val nilai = readln().toInt()
    if (nilai >= 75){
        print("Lulus.")
    }else{
        print("Tidak Lulus.")
    }
}