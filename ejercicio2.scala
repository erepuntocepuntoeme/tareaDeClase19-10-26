abstract class Animal(
  val nombre: String
) {
  def sonido(): String
}

trait Volador {
  def volar(): String = "Volando"
}

trait Nadador {
  def nadar(): String = "Nadando"
}

class Pato(
  nombre: String
) extends Animal(nombre) with Nadador with Volador {
  def sonido(): String = "Kuack Kuack"
}

class Perro(
  nombre: String
) extends Animal(nombre) {
  def sonido(): String = "Bao Bao"
}

class Pez(
  nombre: String
) extends Animal(nombre) with Nadador {
  def sonido(): String = "mpl glu glup"
}