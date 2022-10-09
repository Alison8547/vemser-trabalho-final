public enum MenuClienteEnum implements InterfaceEnum {

    COMPRAR_PASSAGEM("Digite [1] para comprar uma passagem"),
    MOSTRAR_VOO("Digite [2] para mostrar todos os voos"),
    VOLTAR("Digite [0] para voltar ao menu anterior");

    private String descricao;
    MenuClienteEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
