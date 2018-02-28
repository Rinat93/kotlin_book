package network_r

interface Transactions {
    fun open(number : Int): Boolean
    fun err() : String {
        return "Error/Ошибка transaction/Транзакции"
    }
}