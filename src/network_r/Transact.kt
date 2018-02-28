package network_r

class Transact : Transactions {
    override fun open(number: Int) : Boolean {
        return number > 0
    }
}