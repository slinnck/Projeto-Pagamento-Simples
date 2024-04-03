package meio.pagamento.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoStatusClienteEnum {

    CLIENTE_INATIVO(0, "Inativo"),
    CLIENTE_ATIVO(1, "Ativo"),
    CLIENTE_EXCLUIDO(2, "Excluido");

    private final int id;
    private final String descricao;
}
