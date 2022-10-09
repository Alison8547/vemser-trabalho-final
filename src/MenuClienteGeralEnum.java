
public enum MenuClienteGeralEnum {
        ADICIONAR_CLIENTE("Digite [1] para adicionar um cliente"),
        LISTAR_CLIENTE("Digite [2] para listar todos os clientes"),
        BUSCAR_CLIENTE("Digite [3] para buscar um cliente específico"),
        EDITAR_CLIENTE("Digite [4] para editar"),
        EXCLUIR_CLIENTE("Digite [5] para excluir"),
        VOLTAR("Digite [0] para voltar ao menu anterior!");

        private String descricao;
        MenuClienteGeralEnum(String descricao){
            this.descricao = descricao;
        }

        public String getDescricao(){
            return this.descricao;
        }
}
