package meio.pagamento.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoPagamentoEnum {

    CONTA_CORRENTE("conta corrente"),
    CONTA_POUPANCA("conta poupaança");

    private final String descricao;
}
