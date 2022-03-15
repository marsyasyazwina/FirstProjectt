import java.util.*

fun main() {
        val reader = Scanner(System.`in`)
        print("Masukkan harga belanja anda : ")
        val bil1 = reader.nextInt()
        price (bil1)
    }
    fun price(bil1:Int ) {
        val price = bil1

        if (price < 400.000)
            println("Total harganya adalah $price")
        if ((price >= 400.000) && (price <= 80000)) {
            val resultdiscount = price * 4 / 100
            val finalprice = price - resultdiscount
            println("Total harganya adalah $finalprice")
        } else if ((price >= 800.000 && price <= 16000000)) {
            val resultdiscount = price * 9 / 100
            val finalprice = price - resultdiscount
            println("Total harganya adalah $finalprice")
        } else if ((price >= 1600000 && price <= 2000000)) {
            val resultdiscount = price * 19 / 100
            val finalprice = price - resultdiscount
            println("Total harganya adalah $finalprice")
        }else if ((price >= 2000000 && price <= 3000000)) {
            val resultdiscount = price * 40 / 100
            val finalprice = price - resultdiscount
            println("Total harganya adalah $finalprice")
        }else{
            val resultdiscount = price * 40 / 100
            val finalprice = price - resultdiscount
        }

    }