package exerciciosClassesEobjeto

class Funcionario(

    var nome: String,
    var sobrenome: String,
    var horasTrabalhadas: Int,
    var valorPorHora: Double

) {
    fun nomeCompleto() {
        println("O nome completo do funcionário é: $nome $sobrenome")
    }

    fun calcularSalario() {

        val salarioDoMes = horasTrabalhadas * valorPorHora

        println("O salário mensal do funcionário é de R$ ${salarioDoMes}")
    }

    fun incrementarHoras(horasRecebidas: Int) {

        horasTrabalhadas += horasRecebidas

        println("O total de horas trabalhadas foi de $horasTrabalhadas horas" )

    }

}