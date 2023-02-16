import java.lang.IllegalArgumentException

class Tipo(tipos:String) {

    var lista_tipos = mutableListOf<String>("acero","agua", "bicho", "dragon", "electrico", "fantasma", "fuego", "hada", "hielo", "lucha",
        "normal", "planta", "psiquico", "roca", "siniestro", "tierra", "veneno", "volador")
    var tipo = ""
        get() {
            return field
        }
        set(value) {
            if (value in lista_tipos){
                field = value
            }else{
                throw IllegalArgumentException("Tipo no valido")
            }
        }
    init {
        tipo = tipos
    }













}
