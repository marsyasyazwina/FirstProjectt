/*nama,nilai1, nilai2, nilai3, nilai 4*/
fun main() {
    raport("Marsya","A","B","B+","B-")
    raport("Jinsoul","A","B-","C","B-")

}


fun raport (name: String, uiux : String, web : String, android : String, comthink : String) {
    println("Nilai semester 1 dari siswi atas nama ${name}," +
            "adalah sebagai berikut \nui/ux ${uiux} \nWeb ${web} " +
            "\nAndoid ${android} \nComthink ${comthink}")
}

