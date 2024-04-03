package meio.pagamento.dto;

import io.micronaut.serde.annotation.Serdeable;
import lombok.*;
import meio.pagamento.entity.Cliente;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Serdeable.Deserializable
@Getter @Setter
@Data
public class ClienteDTO {

    private Cliente cliente;
}
