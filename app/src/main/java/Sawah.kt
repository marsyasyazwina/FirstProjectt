import java.util.*

fun main() {
    val reader = Scanner (System.`in`)
    print("Masukan meter persegi : ")
    val luassawah = reader.nextInt()

    if (luassawah < 100 ) {
        val harga = luassawah * 100000
        print("Harga yang harus dibayar adalah sejumlah $harga")

    }else if (luassawah >= 100 && luassawah < 500) {
        val harga = luassawah * 100000
        val diskon = harga * 2 / 100
        if (diskon >= 500000) {
            val finalharga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah $finalharga")

        }
    }else if (luassawah >=500 && luassawah <1000) {
        val harga = luassawah * 100000
        val diskon = harga * 5 / 100
        if (diskon >= 500000) {
            val finalharga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah $finalharga")
        }
    }else if (luassawah >= 1000 && luassawah <4000) {
        val harga = luassawah * 100000
        val diskon = harga * 12 / 100
        if (diskon >= 500000) {
            val finalharga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah $finalharga")

        } else {
            val harga = luassawah * 100000
            val diskon = harga * 25 / 100
            if (diskon >= 500000) {
                val finalharga = harga - 500000
                print("Harga yang harus dibayar adalah sejumlah $finalharga")
            }
        }
    }
}