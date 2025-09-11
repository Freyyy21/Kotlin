package controlFlows

fun main(){
    while (true){
        try {
            print("Masukkan nilai ujian (0-100) = ")
            val nilai = readln().toIntOrNull()
            if (nilai != null){
                if (nilai > 100 || nilai < 0){
                    println("Input tidak valid")
                    continue
                }

                if (nilai < 60){
                    println("Status: Tidak lulus")
                }else{
                    println("Staus: Lulus")
                }

                when (nilai) {
                    in 0..69 -> println("Predikat: Kurang")
                    in 70..79 -> println("Predikat: Cukup")
                    in 80..89 -> println("Predikat: Baik")
                    in 90..100 -> println("Predikat: Sangat Baik")

                }
                break
            }
        }catch (e: NumberFormatException){
            println("Input tidak valid!")
        }
    }
}