import java.util.*

fun main () {
    val reader = Scanner (System.`in`)
    println("Masukan bilangan")
    val number = reader.nextInt()

    println("Hasil bilangan ini adalah")

    if (number < 0){
        print("Negative")
    }else{
    print("Positive")
    }
}
