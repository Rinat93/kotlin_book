//import jdk.incubator.http.WebSocket
//import network_r.*
import module.*
import java.io.DataInputStream
import java.io.File
import java.io.PrintStream
import java.net.Socket

//import java.util.*

// расширение типов
fun String.add_r(){
    println("Расширили")
}

// Всякие извращения по словарям
fun BookMap(){
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])
}

// Всякие извращения по стандартным типам
fun BookStdType(){
    "Привет ".add_r()
}

// Всякие извращения по массивам/спискам
fun BookList(){
    val items = listOf("apple", "banana", "kiwi")
    // Вообще прелесть
    items.filter { it.startsWith("k") }.sortedBy{ it }.map{it.toUpperCase()}.forEach{ println(it) }
}
// Работа с файлами
fun FileJobs(){
    val files = File("/home/rinat/").listFiles()
    files.forEach { println(it) }
//    println(files)
}

// Работа с объектами
fun call_class(){
    val pers = Person()
    pers.age = 25
    pers.fio = "Закирьянов Ринат Маратович"
    println(pers.info)
    println(pers.shields())
}

fun main(args: Array<String>) {
//    BookMap()
//    BookStdType()
//    BookList()
//    FileJobs()
//    call_class()
    println("Поток начал работу")
    Kthread("Поток 1", call_class()).start()
    Kthread("Поток 1", call_class()).log()
    println("Поток завершил работу")
}