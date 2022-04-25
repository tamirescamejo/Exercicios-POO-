package exerciciosClassesEobjeto

fun main() {
    val novoFuncionario: Funcionario = Funcionario("Luis", "Silva", 10, 25.50)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(4)
    novoFuncionario.calcularSalario()

    val listaFuncionarios = ArrayList<Funcionario>()
    listaFuncionarios.add(novoFuncionario)

    val funcionario1: Funcionario = Funcionario("Tamires", "Camejo", 20, 25.50)
    listaFuncionarios.add(funcionario1)
    val funcionario2: Funcionario = Funcionario("Taline", "Camejo", 50, 25.50)
    listaFuncionarios.add(funcionario2)
    val funcionario3: Funcionario = Funcionario("Tatiane", "Camejo", 40, 25.50)
    listaFuncionarios.add(funcionario3)
    val funcionario4: Funcionario = Funcionario("Kauã", "Furtado", 60, 26.50)
    listaFuncionarios.add(funcionario4)
    val funcionario5: Funcionario = Funcionario("Milton", "Camejo", 70, 29.50)
    listaFuncionarios.add(funcionario5)
    val funcionario6: Funcionario = Funcionario("Ana", "Felizardo", 55, 25.80)
    listaFuncionarios.add(funcionario6)
    val funcionario7: Funcionario = Funcionario("Ionice", "Camejo", 65, 28.90)
    listaFuncionarios.add(funcionario7)
    val funcionario8: Funcionario = Funcionario("André", "Felizardo", 35, 26.80)
    listaFuncionarios.add(funcionario8)
    val funcionario9: Funcionario = Funcionario("Rodrigo", "Bueno", 55, 28.50)
    listaFuncionarios.add(funcionario9)

    listaFuncionarios.forEach {funcionario ->

        println("++++++++++++++++++++++++++++++++++++++++++++++")
        funcionario.nomeCompleto()
        println("Total de horas trabalhadas: ${funcionario.horasTrabalhadas}")
        println("Valor por hora trabalhada: ${funcionario.valorPorHora}")
        funcionario.calcularSalario()

    }
}


