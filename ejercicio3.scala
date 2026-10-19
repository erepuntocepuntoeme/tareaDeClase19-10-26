abstract class Empleado(
  val nombre: String,
  val salarioBase: Double
) {

  def salarioTotal: Double
}
class Desarrollador (
     nombre:String,
     salarioBase:Double,
     val bono :Double
)extends Empleado (
    nombre,
    salarioBase
){
    def salarioTotal: Double = 
        salarioBase+bono    
}
class Vendedor (
    nombre:String,
    salarioBase:Double,
    val ventas: Int,
    val comision:Double
)extends Empleado (
    nombre,salarioBase 
){
    def salarioTotal: Double = 
        salarioBase+(ventas.toDouble*comision)
}
class Gerente (
    nombre:String,
    salarioBase:Double,
    val Bono:Int
) extends Empleado(
    nombre,
    salarioBase 
){
    def salarioTotal: Double = 
        salarioBase + (Bono*100)
}