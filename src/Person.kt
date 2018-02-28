public class Person {
    var age: Int = 18
    var fio: String = " "
    var info: String = ""
        get() = "фио $fio возраст $age"

    fun shields(): String {
        if (age > 18){
            return " $fio разрешенно т.к. возраст($age) > 18"
        } else {
            return " $fio не разрешенно т.к. возраст($age) < 18"
        }
    }
//    set(value){
//
//    }
}