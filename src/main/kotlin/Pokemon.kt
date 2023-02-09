class Pokemon (id:Int,nombre:String,vida:Int,tipo:String){

    var id:Int = 0
        set(value) {
            if(value<0) {
                throw Exception("El ID no debe ser 0")
            }
        }

    var nombre:String = " "
    var vida:Int = 0
    var tipo:String  = " "

    init {
        this.id = id
      this.vida =vida
      this.tipo = tipo
        }

    override fun toString(): String {
        return "Hola  mi nombre es'$nombre' con $id vida=$vida y  tipo='$tipo'"
    }
}






}