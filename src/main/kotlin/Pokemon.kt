class Pokemon (id:Int,nombre:String,vida:Int,tipo:Tipo){

    var id:Int = 0
    var nombre:String = " "
    var vida:Int = 0
        set(value) {
            if(value <= 0) {
                throw Exception("La vida no puede ser 0")
            }
        }
    var tipo:Tipo

    init {
        this.id = id
      this.vida =vida
      this.tipo = tipo
        }

    override fun toString(): String {
        return "Hola  mi nombre es'$nombre' con $id vida=$vida y  tipo='$tipo'"
    }



}