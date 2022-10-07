package MenuEnums;

public enum MenuCompanhiaEnum {
    //CRIAR_VOO("Criar novo voo = 1"),
    //MOSTRAR_VOO("Mostrar voo = 2"),
    //EDITAR_VOO("Editar voo = 3"),
    //CANCELAR_VOO("Cancelar voo = 4"),
    //IMPRIMIR_VOO("Imprimir voo = 5"),
    IMPRIMIR("Imprimir dados da companhia = 6"),
    VOLTAR("Voltar ao menu anterior = 0");

    private String descricao;
    MenuCompanhiaEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
