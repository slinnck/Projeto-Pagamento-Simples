package meio.pagamento.DTO;

import io.micronaut.serde.annotation.Serdeable;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Serdeable.Deserializable
@Getter @Setter
@Data
public class ClienteDTO {

    private int idFaturaAberta;

}
