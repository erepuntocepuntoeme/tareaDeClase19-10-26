abstract class Vehiculo(val marca: String, val velocidadMaxima: Double) {
  def descripcion(): String
}

trait Electrico {
  def tipoMotor(): String = "Eléctrico"
}

trait Recargable {
  def tiempoDeCarga(): String = "Carga rápida (30 min)"
}

class Automovil(marca: String, velocidadMaxima: Double) extends Vehiculo(marca, velocidadMaxima) {
  def descripcion(): String = s"Automóvil de marca $marca, vel. máx: $velocidadMaxima km/h."
}

class Motocicleta(marca: String, velocidadMaxima: Double) extends Vehiculo(marca, velocidadMaxima) {
  def descripcion(): String = s"Motocicleta de marca $marca, vel. máx: $velocidadMaxima km/h."
}

class AutoElectrico(marca: String, velocidadMaxima: Double) extends Vehiculo(marca, velocidadMaxima) with Electrico with Recargable {
  def descripcion(): String = 
    s"Auto Eléctrico de marca $marca, vel. máx: $velocidadMaxima km/h. " +
    s"Motor: ${tipoMotor()}, ${tiempoDeCarga()}."
}

object PruebaVehiculos {
  def main(args: Array[String]): Unit = {
    val auto = new Automovil("Toyota", 180.0)
    val moto = new Motocicleta("Yamaha", 220.0)
    val autoElec = new AutoElectrico("Tesla", 250.0)

    println(auto.descripcion())
    println(moto.descripcion())
    println(autoElec.descripcion())
  }
}