import java.util.*

fun main() {
    print ("Masukan berat badan anda! \nBerat badan (kg): ")
    val reader = Scanner (System.`in`)
    val berat_badan = reader.nextInt()
    print("Masukkan tinggi badan anda! \nTinggi badan (cm): ")
    val tinggi_badan = reader.nextInt()
    val tinggi_badan_meter = tinggi_badan.toDouble()/100
    val tinggi_final = tinggi_badan_meter * tinggi_badan_meter
    val Bmi = berat_badan.toDouble() / tinggi_final

    println(
        "Berat badan anda adalah $berat_badan dan tinggi badan anda adalah" +
                "$tinggi_badan sehingga didapat BMI $Bmi dan berdasarkan BMI anda" +
                "masuk ke dalam kategori "
    )

    if (Bmi < 18.5) {
        println("terlalu kurus")
    } else if (Bmi >= 18.5 && Bmi < 25) {
        println("normal")
    } else {
        println("gemuk")
    }

}