package meio.pagamento.Entity;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import meio.pagamento.Enum.TipoPagamentoEnum;
import meio.pagamento.Enum.TipoStatusClienteEnum;

import java.math.BigDecimal;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Serdeable
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private BigDecimal limiteCredito;
    private TipoPagamentoEnum tipoPagamentoEnum;
    private TipoStatusClienteEnum statusCliente;
}
