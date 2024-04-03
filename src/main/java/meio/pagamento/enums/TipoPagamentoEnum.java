package meio.pagamento.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.Interceptor;
import org.hibernate.ObjectNotFoundException;

@Getter
@AllArgsConstructor
public enum TipoPagamentoEnum {

    CREDITO("conta de crédito"),
    DEBITO("conta de débito");

    private final String descricao;


    public static String tipoPagamento(Integer tipo) {
        String tipoPagamento;
        switch (tipo) {
            case 1:
                tipoPagamento = TipoPagamentoEnum.CREDITO.getDescricao();
                break;
            case 2:
                tipoPagamento = TipoPagamentoEnum.DEBITO.getDescricao();
                break;
            default:
                throw new ObjectNotFoundException("Tipo de pagamento inválido!", tipo.toString());
        }
        return tipoPagamento;
    }
}
