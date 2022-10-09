public enum MenuCompanhiaGeralEnum implements InterfaceEnum {
    MOSTRAR_COMPANHIAS("Digite [1] para mostrar companhias"),
    CRIAR_COMPANHIA("Digite [2] para criar um companhia"),
    SELECIONAR_COMPANHIA("Digite [3] para selecionar uma companhia"),
    EDITAR_COMPANHIA("Digite [4] para editar uma companhia"),
    DELETAR_COMPANHIA("Digite [5] para deletar uma companhia"),
    VOLTAR("Digite [0] para voltar ao menu anterior");

    private String descricao;

    MenuCompanhiaGeralEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
