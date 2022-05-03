package calculoSalarios

class Roles (var idRol: Int, var nombreRol: String, var salarioHora: Int, var horasTrabajoMes: Int, var horasBonus: Int) {

    var salarioBase: Int = salarioHora * horasTrabajoMes
    var salarioBonus: Int = salarioHora * horasBonus

    fun calcularSalarioTotal() = println("El salario del ${nombreRol} es ${salarioBase + salarioBonus}")

}