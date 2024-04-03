package meio.pagamento.controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import meio.pagamento.dto.ClienteDTO;
import meio.pagamento.dto.request.CadastrarClienteRequest;
import meio.pagamento.entity.Cliente;
import meio.pagamento.service.ClienteService;

import java.util.List;
import java.util.logging.Logger;

@Controller("/cliente")
public class ClienteController {

    @Inject
    ClienteService clienteService;

    final Logger logger = Logger.getLogger(ClienteController.class.getName());

    @Post(value = "/cadastro")
    public String cadastrar(@Body CadastrarClienteRequest request) {
        String response = clienteService.salvarCliente(request);
        logger.info("Cliente cadastrado com sucesso!");
        return response;
    }

    @Get(value = "/buscar-todos-clientes")
    public List<Cliente> buscar() {
        return clienteService.buscarClientes();
    }

}
