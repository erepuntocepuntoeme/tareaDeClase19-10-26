trait Notificacion {
  def enviar(mensaje: String): String
}

class Email extends Notificacion {
  def enviar(mensaje: String): String = s"Enviando correo: $mensaje"
}

class SMS extends Notificacion {
  def enviar(mensaje: String): String = s"Enviando SMS: $mensaje"
}

class Push extends Notificacion {
  def enviar(mensaje: String): String = s"Enviando notificación: $mensaje"
}

object SistemaNotificaciones {
  // Función que procesa cualquier notificación
  def procesarNotificacion(notificacion: Notificacion, mensaje: String): String = {
    notificacion.enviar(mensaje)
  }

  def main(args: Array[String]): Unit = {
    val correo = new Email()
    val sms    = new SMS()
    val push   = new Push()

    val mensaje = "Hola"

    println(procesarNotificacion(correo, mensaje))
    println(procesarNotificacion(sms, mensaje))
    println(procesarNotificacion(push, mensaje))
  }
}