public enum SelecionarPassagemEnum {

    DATA("Digite [1] para buscar voo por data de partida"),
    PARTIDA_CHEGADA("Digite [2] para buscar voo por trajeto"),
    VOLTAR("Digite [0] para voltar ao menu anterior");

    private String descricao;
    SelecionarPassagemEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
