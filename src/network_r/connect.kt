package network_r

fun test_r() : Int {
    println(Transact().err())
    println(Transact().open(1))
    println(Transact().open(0))
    return 2
}