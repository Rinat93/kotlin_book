package module
import java.util.*
class Kthread<T> : Thread {
    var res: T
    constructor(name: String, res: T):super(name) {
        // объект/функция запуска в потоке
        this.res = res
    }

    init {
        println("logging")
    }

    override fun run(){
        // Сразу по умолчанию синхронизируем потоки
        synchronized<Unit>(this.res!!){
            println("Поток начал работу ${Thread.currentThread().name}")
            try{
                Thread.sleep(500)
            }catch (e: InterruptedException){
                println("Поток прерван ошибка ${e}")
            }
        }
    }
}