import java.util.*

fun main() {
    val reader = Scanner (System.`in`)
    println("Pilihlah konversi suhu yang kamu inginkan dengan angka 1, 2, atau 3 ! \n" +
            "1. Fahrenheit\n" +
            "2. Kelvin \n" +
            "3. Reamur \n" +
            "Inputkan pilihanmu : \n"
    )
    val bil1 = reader.nextInt()

    if (bil1==1) {
        val skalaKonversi = "Fahrenheit"
        print("Masukan suhu dalam sekala celcius yang ingin kamu konversikan ! \n" +
                "Masukan suhu (celcius) : \n")
        val bil2 = reader.nextInt()
        val suhuAwal = bil2
        val suhuAkhir = (suhuAwal * 9/5) + 32
        print("Hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")

    }else if (bil1==2) {
        val skalaKonversi = "Kelvin"
        print("Masukan suhu dalam sekala celcius yang ingin kamu konversikan ! \n" +
                "Masukan suhu (celcius) : \n")
        val bil2 = reader.nextInt()
        val suhuAwal = bil2
        val suhuAkhir = suhuAwal + 273
        print("Hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")

    }else if (bil1==3) {
        val skalaKonversi = "Reamur"
        print("Masukan suhu dalam sekala celcius yang ingin kamu konversikan ! \n" +
                "Masukan suhu (celcius) : \n")
        val bil2 = reader.nextInt()
        val suhuAwal = bil2
        val suhuAkhir = suhuAwal * 4/5
        print("Hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")
    }
}