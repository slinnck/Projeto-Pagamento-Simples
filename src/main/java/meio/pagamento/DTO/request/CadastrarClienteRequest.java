package meio.pagamento.DTO.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Serdeable
@JsonIgnoreProperties(ignoreUnknown = true)
public class CadastrarClienteRequest {

    private Long id;
    private String cpf;
    private String nomeCliente;
    private String dataNascimento;
    private String contaPagamento;
}
