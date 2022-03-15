//persegi, persegi panjang, jajar genjang, layang - layang, trapesium, lingkaran, segitiga, belah ketupat

fun main() {
    persegi(8.0)
    persegiPanjang(9.0, 8.0)
    jajarGenjang (7.0, 8.0)
    layangLayang (6.0, 4.0)
    trapesium (4.0,4.0)
    lingkaran(3.14, 6.0,6.0)
    segitiga (4.0,4.0)
}

fun segitiga(alas : Double, tinggi: Double) {
    val result = alas * tinggi /2
        println("Luas segitiga adalah $result")
}

fun lingkaran(phi : Double, radius : Double, r : Double) {
    val result = phi * radius * r
    println("Luas lingkaran adalah $result")
}

fun trapesium(panjang: Double, tinggi: Double) {
    val result = panjang * tinggi /2
    println("Luas trapesium adalah $result")

}

fun layangLayang(D1 : Double, D2 : Double) {
    val result = D1 * D2 /2
    println("Luas layang layang adalah $result")
}

fun jajarGenjang(alas : Double, tinggi : Double) {
    val result = alas * tinggi
    println("Luas jajar genjang adalah $result")

}

fun persegiPanjang(panjang : Double, lebar : Double) {
    val result = panjang * lebar
    println("Luas persegi panjang adalah $result")
}

fun persegi(sisi : Double) {
    val result = sisi * sisi
    println("Luas persegi adalah $result")
}

