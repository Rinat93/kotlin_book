package module

import java.net.Socket

class KSockets : Socket {
    constructor(host:String,port:Int):super(host, port){}
}