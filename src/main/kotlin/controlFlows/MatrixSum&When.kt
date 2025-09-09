package controlFlows

fun main(){
    val totalBarisMatrix = 3
    val totalKolomMatrix = 3
    val arrayMatrix = Array(3){ IntArray(3) }

    //Mengisi Array
    for (i in 0 until totalBarisMatrix){
        for (j in 0 until totalKolomMatrix) {
            print("Nilai matrix [${i+1}][${j+1}] = ")
            arrayMatrix[i][j] = readln().toInt()
        }
    }

    //Menjumlahkan isi array
    var jumlahIsi = 0
    for (i in 0 until totalBarisMatrix){
        for (j in 0 until totalKolomMatrix) {
            jumlahIsi += arrayMatrix[i][j]
        }
    }

    println("Total = $jumlahIsi")
    if (jumlahIsi < 10){
        println("Kecil")
    }else if (jumlahIsi in 10..20 ){
        println("Sedang")
    }else{
        println("Besar")
    }
}