package basic

fun main(){
    print("Masukkan umur: ")
    val umur = readln().toInt()
    if (umur < 13){
        print("Anda anak-anak")
    }else if(umur in 13..17){
        print("Anda remaja")
    }else if (umur in 18..59){
        print("Anda dewasa")
    }else{
        print("Anda lansia")
    }
}