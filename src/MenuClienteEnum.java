public enum MenuClienteEnum {

    COMPRAR_PASSAGEM("Comprar passagem = 1"),
    MOSTRAR_VOO("Mostrar todos os voos = 2"),
    VOLTAR("Voltar ao menu anterior = 0");

    private String descricao;
    MenuClienteEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
