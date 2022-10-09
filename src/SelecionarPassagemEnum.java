public enum SelecionarPassagemEnum {

    DATA("Buscar voo por data de partida= 1"),
    PARTIDA_CHEGADA("Buscar voo por trajeto = 2"),
    VOLTAR("Voltar ao menu anterior = 0");

    private String descricao;
    SelecionarPassagemEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
