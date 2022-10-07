package MenuEnums;

public enum MenuCompanhiaGeralEnum {
    MOSTRAR_COMPANHIAS("Mostrar Companhias = 1"),
    CRIAR_COMPANHIA("Criar nova Companhia = 2"),
    SELECIONAR_COMPANHIA("Selecionar Companhia = 3"),
    EDITAR_COMPANHIA("Editar Companhia = 4"),
    DELETAR_COMPANHIA("Deletar Companhia = 5"),
    VOLTAR("Voltar ao menu anterior = 0");

    private String descricao;

    MenuCompanhiaGeralEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

}
