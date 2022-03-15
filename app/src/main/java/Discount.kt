/* Ibu beli belajaan di supermarket
400.000 -> diskon 4 %
800.000 -> diskon 9 %
1.600.000 -> diskon 19 %
2.000.000 -> diskon 25 %
3.000.000 -> diskon 40 %
total uang yang harus dibayar */

fun main() {
    val price = 1400000

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
    } else if ((price >= 2000000 && price <= 3000000)) {
        val resultdiscount = price * 25 / 100
        val finalprice = price - resultdiscount
        println("Total harganya adalah $finalprice")
    } else{
        val resultdiscount = price * 40 / 100
        val finalprice = price - resultdiscount
        println("Total harganya adalah $finalprice")
    }


}