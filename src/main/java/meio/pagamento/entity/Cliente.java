package meio.pagamento.entity;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import meio.pagamento.enums.TipoPagamentoEnum;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
@Serdeable
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "nomeCliente", nullable = false)
    private String nomeCliente;

    @Column(name = "dataNascimento")
    private String dataNascimento;

    @Column(name = "contaPagamento")
    private String contaPagamento;
}

