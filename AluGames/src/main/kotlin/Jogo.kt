class Jogo {
    var titulo = ""
    var capa = ""
    val descricao = ""

    override fun toString(): String {
        return "Meu jogo: \n" +
                "Titulo: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }
}