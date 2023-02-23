import java.lang.IllegalArgumentException

class Tipo(tipos:String,tipo_2:String) {

    var lista_tipos = mutableListOf<String>(
        "acero", "agua", "bicho", "dragon", "electrico", "fantasma", "fuego", "hada", "hielo", "lucha",
        "normal", "planta", "psiquico", "roca", "siniestro", "tierra", "veneno", "volador"
    )
    var tipo_2 = ""
        get() {
            return field
        }
        set(value) {
            if (value in lista_tipos) {
                field = value
            } else {
                throw IllegalArgumentException("Tipo no valido")
            }
        }
    var tipo = ""
        get() {
            return field
        }
        set(value) {
            if (value in lista_tipos) {
                field = value
            } else {
                throw IllegalArgumentException("Tipo no valido")
            }
        }

    init {
        tipo = tipos
    }

    fun efectividad_tipos(): String {

        if (tipo == "acero") {
            if (tipo_2 in arrayOf("hada", "hielo", "roca")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "agua") {
            if (tipo_2 in arrayOf("fuego", "roca","tierra")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "bicho") {
            if (tipo_2 in arrayOf("planta", "siniestro","psiquico")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "dragon") {
            if (tipo_2 in arrayOf("dragon")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "electrico") {
            if (tipo_2 in arrayOf("agua","volador")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "fantasma") {
            if (tipo_2 in arrayOf("fantasma","psiquico")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "fuego") {
            if (tipo_2 in arrayOf("acero","planta","bicho","hielo")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "hada") {
            if (tipo_2 in arrayOf("dragon","lucha","siniestro")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "hielo") {
            if (tipo_2 in arrayOf("dragon","planta","tierra","volador")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "lucha") {
            if (tipo_2 in arrayOf("acero","hielo","normal","roca","siniestro")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "normal") {
            if (tipo_2 in arrayOf("")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "planta") {
            if (tipo_2 in arrayOf("agua","roca","tierra")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "planta") {
            if (tipo_2 in arrayOf("agua","roca","tierra")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "psiquico") {
            if (tipo_2 in arrayOf("lucha","veneno")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "roca") {
            if (tipo_2 in arrayOf("bicho","fuego","hielo","volador")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "siniestro") {
            if (tipo_2 in arrayOf("fantasma","psiquico")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "tierra") {
            if (tipo_2 in arrayOf("acero","electrico","fuego","roca")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "veneno") {
            if (tipo_2 in arrayOf("hada","normal")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        if (tipo == "volador") {
            if (tipo_2 in arrayOf("bicho","hielo","normal")) {
                return " $tipo es super efectivo con $tipo_2"
            } else {
                return " $tipo no es super efectivo para $tipo_2"
            }
        }
        return tipo
    }

    override fun toString(): String {
        return "tipo = $tipo"
    }


}











