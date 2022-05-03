package calculoSalarios
import java.util.*

fun calcularSalario() {
    val gerente = Roles(idRol = 1, nombreRol = "Gerente", salarioHora = 200, horasTrabajoMes = 200, horasBonus = 0)
    val operador = Roles(idRol = 2, nombreRol = "Operador", salarioHora = 10, horasTrabajoMes = 230, horasBonus = 10)
    val contador = Roles(idRol = 3, nombreRol = "Contador", salarioHora = 50, horasTrabajoMes = 200, horasBonus = 0)


    println("Bienvenido a la calculadora de salarios")
    println("Ingrese el rol al caul le desea calcular el salario:")
    println("${gerente.idRol} ${gerente.nombreRol}")
    println("${operador.idRol} ${operador.nombreRol}")
    println("${contador.idRol} ${contador.nombreRol}")
    println("4. Salir")

    var seleccion = readLine()

    while (true) {
        when (seleccion){
            "1" -> {
                gerente.calcularSalarioTotal()
                break
            }
            "2" -> {
                operador.calcularSalarioTotal()
                break
            }
            "3" -> {
                contador.calcularSalarioTotal()
                break
            }
            "4" -> {
                println("Saliendo")
                break
            }
            else -> println("Selección equivocada, inténtelo de nuevo")
        }
    }

}


fun main(){
    calcularSalario()
}