package controlFlows

fun main(){

    print("Masukkan kata atau kalimat = ")
    val input = readln().lowercase()
    val clean = input.toCharArray()
    val letters = ArrayList<Char>()

    for (i in clean){
        if (i.isLetter()){
            letters.add(i)
        }
    }

    for (i in letters.size-1 downTo 0){
        print(letters[i])
    }

    println()
    for (i in letters.reversed()){
        print(i)
    }

    var vokal = 0
    var konsonan = 0
    for (i in letters){
        if (i in listOf('a', 'i', 'u', 'e', 'o')){
            vokal++
        }else{
            konsonan++
        }
    }

    println("\nHuruf vokal = $vokal")
    println("Huruf konsonan = $konsonan")


}