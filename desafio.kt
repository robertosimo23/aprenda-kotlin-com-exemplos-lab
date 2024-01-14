enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO}

data class Usuario

data class BASICO(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
       inscritos.add(usuario)
    }
     override fun toString():String{
        return "$nome, $conteudos, $inscritos"
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste.Para isso, crie alguns objetos usando as classes em questão.")

    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val lxd5k=Usuario("LxD5k", Nivel.BASICO)
    val kotlin=ConteudoEducacional("kotlin", 120)
    val java=ConteudoEducacional("java", 12000)
    val androidStudio=ConteudoEducacional("androidStudio")
    val formacao=Formacao("devMobaile", listOf(kotlin, java, androidStudio))
    formacao.matricular(lxd5k)
    formacao.matricular(lxd5k)
    println(formacao)

}
