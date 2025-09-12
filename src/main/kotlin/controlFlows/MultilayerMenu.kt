package controlFlows

fun main(){
    val nama = ArrayList<String>()
    val nim = ArrayList<Long>()

    outer@while (true){
        println("1. Tambah data")
        println("2. Tampilkan data")
        println("3. Hapus data")
        println("4. Keluar")
        print("Masukkan pilihan = ")
        var inputOption = readln().toIntOrNull() ?: continue

        when(inputOption){
            1 -> {
                opsi1@while(true){
                    print("Masukkan nama = ")
                    val inputNama = readln()
                    print("Masukkan NIM = ")
                    val inputNim = readln().toLongOrNull() ?: continue@opsi1
                    nama.add(inputNama)
                    nim.add(inputNim)
                    break@opsi1
                }
            }
            2 -> {
                opsi2@while(true){
                    if (nama.isNotEmpty()) {
                            for ((index, pair) in nama.zip(nim).withIndex()) {
                                val (a,b) = pair
                                println("No.${index+1} Nama = $a\nNo.${index+1} NIM = $b")
                            }
                        break@opsi2
                    }
                }
            }
            3 -> {
                opsi3@while(true){
                    print("Masukkan no yang ingin dihapus = ")
                    val delete = readln().toIntOrNull() ?: continue@opsi3
                    if (delete-1 > nama.size ){
                        println("Data tidak ditemukan!")
                        continue@opsi3
                    }
                    nama.removeAt(delete-1)
                    nim.removeAt(delete-1)
                        break@opsi3
                }
            }
            4 -> break@outer
        }
    }
}