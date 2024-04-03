package meio.pagamento.service;

import jakarta.inject.Singleton;
import meio.pagamento.dto.ClienteDTO;
import meio.pagamento.dto.request.CadastrarClienteRequest;
import meio.pagamento.entity.Cliente;

import java.util.List;

@Singleton
public interface ClienteService {

    List<Cliente> buscarClientes();

    String salvarCliente(CadastrarClienteRequest clienteDTO);
}
