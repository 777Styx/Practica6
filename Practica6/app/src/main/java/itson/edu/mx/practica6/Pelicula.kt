package itson.edu.mx.practica6

data class Pelicula(
    var nombre: String,
    var image: Int,
    var header: Int,
    var sinopsis: String,
    var seats: ArrayList<Cliente>
) {
}
