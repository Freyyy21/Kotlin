package basic

fun main(){
    print("Masukkan berat anda (Kg)")
    val berat = readln().toInt()
    print("Masukkan tinggi anda (m): ")
    val tinggi = readln().toDouble()

    val bmi = berat/(tinggi*tinggi)
    if (bmi < 18.5){
        print("Anda kurus")
    }else if(bmi in 18.5..24.9){
        print("Anda normal")
    }else if(bmi in 25.toDouble()..29.9){
        print("Anda gemuk")
    }else{
        print("Anda obesitas")
    }
}