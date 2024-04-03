package meio.pagamento.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import meio.pagamento.entity.Cliente;

import java.util.List;

@Getter
@AllArgsConstructor
@Serdeable
@JsonIgnoreProperties(ignoreUnknown = true)
public class CadastrarClienteRequest {

    private String cpf;
    private String nomeCliente;
    private String dataNascimento;
    private int tipoContaPagamento;
}
