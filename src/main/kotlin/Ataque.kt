class Ataque(nombre:String,tipo:String,fuerza:Int) {

    var nombre:String = ""
    var tipo:String  = " "
    var fuerza:Int = 0
        set(value) {
            if(value<0) {
                throw Exception("La fuerza no puede ser 0")
            }
        }
    override fun toString(): String {
        return "Ataque $nombre de tipo $tipo con fuerza $fuerza"
    }


}