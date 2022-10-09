public enum MenuCompanhiaEnum {
    CRIAR_VOO("Digite [1] para criar um voo"),
    MOSTRAR_VOO("Digite [2] para mostrar todo os voos"),
    EDITAR_VOO("Digite [3] para editar um voo"),
    CANCELAR_VOO("Digite [4] para cancelar um voo"),
    IMPRIMIR("Digite [5] para imprimir dados do voo"),
    VOLTAR("Digite [0] para voltar ao menu anterior");

    private String descricao;

    MenuCompanhiaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public enum TipoPagamento {
        PIX,
        CARTAO,
        BOLETO
    }
}
