package meio.pagamento.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoStatusClienteEnum {

    CLIENTE_ATIVO(0, "Ativo"),
    CLIENTE_INATIVO(1, "Inativo");

    private final int id;
    private final String descricao;
}
