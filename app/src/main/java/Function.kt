fun main() {
    val name = "Jisung's gf"
    morning(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    afternoon(name)
    evening(name)
    evening(name)
    evening(name)
    night(name)
    morning(name)
    goodbye(name)
    goodbye(name)



}
fun morning(name: String){
    println("Halo selamat pagi ${name}")
}
fun afternoon(name: String){
    println("Halo selamat siang ${name}")
}
fun evening(name: String){
    println("Halo selamat sore ${name}")
}
fun night(name: String){
    println("Halo selamat malam ${name}")
}
fun goodbye(name: String){
    println("Halo selamat datang $name")
}