//ejercicio 48 
trait Figura {
    def area :Double 
}
class Rectangulo(
  val base: Double,
  val altura: Double
) extends Figura {

  def area: Double =
    base * altura
}
class Circulo(
  val radio: Double
) extends Figura {

  def area: Double =
    Math.PI * radio * radio
}
class triangulo(
    val base: Double,
    val altura: Double
    
) extends Figura {

    def area: Double = base*altura/2
}

def mostrarArea(figura: Figura): Double = {
  figura.area
}
@main def probarFiguras(): Unit = {
  val c = new Circulo(5.0)
  val t = new triangulo (10.0, 4.0)
  val r = new Rectangulo(4.0, 3.0)

  println(s"Área del Círculo: ${mostrarArea(c)}")
  println(s"Área del Triángulo: ${mostrarArea(t)}")
  println(s"Área del Rectángulo: ${mostrarArea(r)}")
}